import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FileWatcherLambda {

    public static final int PAUSE_TIME = 500;
    private static final String SPLIT_REGEX = " ";
    private static final List<String> fileList = new ArrayList<>();

    public static void watch(String[] args) {

        Arrays.stream(args)
            .forEach(file -> {
                FileWatcherLambda.fileList.add(file);
            });

        if (FileWatcherLambda.fileList.size() == 0) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                Arrays.stream(br.readLine()
                            .trim()
                            .split(FileWatcherLambda.SPLIT_REGEX))
                        .forEach(in -> fileList.add(in));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        fileList.forEach(file -> {
            new Thread(() -> {
                File f = new File(file);
                if (f.isFile()) {
                    System.out.println("File " + file + " is Available..");
                } else {
                    System.out.println("File " + file + " is not Available.. <----------------");
                }
                try {
                    Thread.sleep(FileWatcherLambda.PAUSE_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        });
    }
}

public class FileWatcherLambdaDemo {
    public static void main(String[] args) {
        FileWatcherLambda.watch(args);
    }
}
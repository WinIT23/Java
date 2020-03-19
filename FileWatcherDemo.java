import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class FileWatcher implements Runnable {

    public static final int PAUSE_TIME = 500;
    private final String fileName;

    FileWatcher(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        File f = new File(fileName);
        try {
            if (f.isFile()) {
                System.out.println("File " + fileName + " is Available..");
                Thread.sleep(FileWatcher.PAUSE_TIME);
            } else {
                System.out.println("File " + fileName + " is not Available.. <----------------");
                Thread.sleep(FileWatcher.PAUSE_TIME);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

public class FileWatcherDemo {

    public static final String SPLIT_REGEX = " ";

    private static boolean isArgsEmpty = false;
    private static String[] fileNamesArray;

    public static void main(String[] args) {

        // Checks if there are commandline argument present
        FileWatcherDemo.isArgsEmpty = (args.length == 0)? true : false;
        
        // If arguments are not present then reads space saprated input from user
        if (FileWatcherDemo.isArgsEmpty) {
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                FileWatcherDemo.fileNamesArray = br.readLine().trim().split(FileWatcherDemo.SPLIT_REGEX);
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        } else {
            FileWatcherDemo.fileNamesArray = args;
        } 
    
        for (String file : FileWatcherDemo.fileNamesArray) {
            new Thread(new FileWatcher(file)).start();
        }
    }
}

package com.lambda.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWatcherLambdaDemo {
    
    public static final int PAUSE_TIME = 500;
    private static final String SPLIT_REGEX = " ";
    private static final List<String> fileList = new ArrayList<>(); 
    public static void main(String[] args) {
        
        Arrays.stream(args)
            .forEach(file -> fileList.add(file));

        fileList.forEach( file -> {
            new Thread(() -> {
                File f = new File(file);
               
                System.out.println( "File " + f.getName() + (f.isFile()? " is Available" : " is not Available <---------------"));
               
                try {
                    Thread.sleep(FileWatcherLambdaDemo.PAUSE_TIME);
                } catch(InterruptedException ex) {ex.printStackTrace();}
            }).start();
        });
    }
}
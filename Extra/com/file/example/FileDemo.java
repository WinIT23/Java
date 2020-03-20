package com.file.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.file.example.read.FileReadClass;
import com.file.example.write.FileWriteClass;

public class FileDemo {

    public static final int CHOICE_READ = 1,
                            CHOICE_WRITE = 2,
                            CHOICE_CHANGE = 3;

    public static void main(String[] args) {
        String filePath = args.length != 0? args[0] : "";
        try(BufferedReader br = new BufferedReader(
                                    new InputStreamReader(System.in))) {                   
            
            FileDemo.printMenu();
            do {    
                System.out.println("Enter a choice : ");
                int choice = Integer.parseInt(br.readLine().trim());

                if(choice == FileDemo.CHOICE_READ) {
                    FileReadClass.read(filePath);
                } else if(choice == FileDemo.CHOICE_WRITE) {
                    FileWriteClass.write(filePath);
                } else {
                    filePath = br.readLine().trim();
                }
            } while (!isLeaving(br));
            
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void printMenu() {
        String s = "1. Read from the given file. \n" 
                + "2. Write to the given file. \n" 
                + "3. Change target file";

        System.out.println(s);
    }

    public static boolean isLeaving(BufferedReader br) throws IOException {
        System.out.println("Do you want to continue ? [Y/n]");
        return br.readLine().trim().equals("n")? true: false;
    }
}
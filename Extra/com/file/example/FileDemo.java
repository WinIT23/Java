package com.file.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.file.example.read.FileReadClass;
import com.file.example.write.FileWriteClass;

public class FileDemo {

    public static final int CHOICE_READ = 1,
                            CHOICE_WRITE = 2,
                            CHOICE_CHANGE = 3,
                            CHOICE_MENU = 4,
                            CHOICE_QUIT = 5;

    public static void main(String[] args) {
        String filePath = args.length != 0? args[0] : "";
        try(BufferedReader br = new BufferedReader(
                                    new InputStreamReader(System.in))) {                   
            
            FileDemo.printMenu();
            loop: do {    
                System.out.println("Enter a choice : ");
                int choice = Integer.parseInt(br.readLine().trim());

                switch(choice) {
                    case FileDemo.CHOICE_READ: 
                        FileReadClass.read(filePath);
                        break;
                    case FileDemo.CHOICE_WRITE:
                        FileWriteClass.write(filePath);
                        break;
                    case FileDemo.CHOICE_CHANGE:
                        filePath = br.readLine().trim();
                        break;
                    case FileDemo.CHOICE_MENU:
                        printMenu();
                        continue loop;
                    case FileDemo.CHOICE_QUIT:
                        System.out.println("Bbyee!!! We will miss you...");
                        break loop;
                    default:
                        System.out.println("Invalid Choice");
                        continue loop;
                }

            } while (true);
            
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void printMenu() {
        String s = "\t1. Read from the given file. \n" 
                + "\t2. Write to the given file. \n" 
                + "\t3. Change target file. \n" 
                + "\t4. Print Menu. \n" 
                + "\t5. Quit.";

        System.out.println(s);
    }

    public static boolean isLeaving(BufferedReader br) throws IOException {
        System.out.println("Do you want to continue ? [Y/n]");
        return br.readLine().trim().equals("n")? true: false;
    }
}
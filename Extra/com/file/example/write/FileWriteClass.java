package com.file.example.write;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

@FunctionalInterface
interface FileWrite {
    boolean writeFile(String fileName);
}

public class FileWriteClass {
    public static void write(String fileName) {
        System.out.println("Enter text you want to add : ");
        FileWrite fw = (file) -> {
            try(FileWriter fWriter = new FileWriter(file)) {
                 BufferedReader br = new BufferedReader(
                                    new InputStreamReader(System.in));
                String  str = "" ,
                        temp = "";
                while(true){
                    temp = br.readLine().trim();
                    if(temp.equals(":q")) 
                        break;
                    else 
                        str = str + temp + "\n";
                }
                fWriter.write(str);
            } catch(IOException ex) {
                return false;
            } 
            return true;
        };

        fw.writeFile(fileName);
    }
}
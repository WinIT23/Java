package com.file.example.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface
interface FileRead {
    String readFile(String fileName) throws IOException;
}

public class FileReadClass {
    public static void read(String fileName) throws IOException {
        FileRead readF = (file) -> {
            try (FileReader fr = new FileReader(file)) {
                String s = "";
                int ch = fr.read();
                while (ch != -1) {
                    s += (char) ch;
                    ch = fr.read();
                }
                return s;
            } catch (FileNotFoundException ex) {
                System.out.println("Oops!! Cannot find the File to be read!!");
                return "";
            }
        };
        System.out.println("The File Contains : ");
        System.out.println(readF.readFile(fileName));
    }
}

package com.file.example.read;

import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReadClass.read(args[0]);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
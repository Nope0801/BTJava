package org.hina.FileExample;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/hina/FileExample/file.txt");
        System.out.println("File name: " + file.getAbsoluteFile());
        System.out.println("File name: " + file.getName());
        System.out.println("Size: " + file.length());
        System.out.println("Created date: " + file.lastModified());
        System.out.println("Is file: " + file.isFile());
    }
}

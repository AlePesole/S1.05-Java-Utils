package n1ejercicio2;

import DirectoryControl.Directory;

import java.io.File;
import java.util.Arrays;

public class ListDirectoryAllFiles {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: insert path of your directory");
            return;
        }

        String directoryPath = System.getProperty("user.dir") + File.separator + args[0];
        ;
        File directory = Directory.validate(directoryPath);

        System.out.println(" ─" + directory.getName());
        listDirectoryRecursive(directory, 0);
    }

    private static void listDirectoryRecursive(File directory, int level) {
        File[] files = directory.listFiles();
        if (files == null) return;

        level++;
        String tabs = "\t".repeat(level);
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(tabs + "└(D) " + file.getName());
                listDirectoryRecursive(file, level);
            } else {
                System.out.println(tabs + "└(F) " + file.getName());
            }
        }
    }
}

package n1ejercicio3;

import DirectoryControl.Directory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListDirectoryWriteFile {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Error: insert arg1-> Path directory to list | arg2-> Path to write files");
            return;
        }

        String directoryPath = System.getProperty("user.dir") + File.separator + args[0];
        File directory = Directory.validate(directoryPath);

        StringBuilder directoryFiles = new StringBuilder();
        directoryFiles.append(" ─").append(directory.getName()).append("\n");
        directoryFiles.append(listDirectoryRecursive(directory, 0));

        String directorySave = System.getProperty("user.dir") + File.separator + args[1];
        writeFile(new File(directorySave) , directoryFiles.toString());
    }

    private static String listDirectoryRecursive(File directory, int level) {
        File[] files = directory.listFiles();
        if (files == null) return "";

        StringBuilder sb = new StringBuilder();
        level++;
        String tabs = "\t".repeat(level);
        for (File file : files) {
            if (file.isDirectory()) {
                sb.append(tabs).append("└(D) ").append(file.getName()).append("\n");
                sb.append(listDirectoryRecursive(file, level));
            } else {
                sb.append(tabs).append("└(F) ").append(file.getName()).append("\n");
            }
        }
        return sb.toString();
    }

    public static void writeFile(File directorySave, String directoryFiles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(directorySave))) {
            writer.write(directoryFiles.toString());
            System.out.println("Directory Info saved in: " + directorySave);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

package n2ejercicio1;

import DirectoryControl.Directory;

import java.io.*;
import java.util.Properties;

public class PropertiesN1exercise3 {
    public static void main(String[] args) {

        Properties properties = new Properties();

        try (FileInputStream fis = new FileInputStream("configuration.properties")) {
            properties.load(fis);

            String directoryPath = System.getProperty("user.dir") + File.separator + properties.getProperty("directory");
            String filePath = System.getProperty("user.dir") + File.separator + properties.getProperty("file");

            File directory = Directory.validate(directoryPath);
            File file = new File(filePath);

            StringBuilder directoryFiles = new StringBuilder();
            directoryFiles.append(" ─").append(directory.getName()).append("\n");
            directoryFiles.append(listDirectoryRecursive(directory, 0));
            directoryFiles.append("*Saved using configuration.properties");

            writeFile(file , directoryFiles.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
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

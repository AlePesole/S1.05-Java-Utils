package n1ejercicio4;

import DirectoryControl.Directory;

import java.io.*;

public class ListDirectoryReadFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: insert path of your directory");
            return;
        }

        String directoryPath = System.getProperty("user.dir") + File.separator + args[0];
        File directory = new File(directoryPath);

        readFile(directory);
    }

    public static void readFile(File directory) {
        try (BufferedReader br = new BufferedReader(new FileReader(directory))) {
            System.out.println("--Reading " + directory.getName());
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

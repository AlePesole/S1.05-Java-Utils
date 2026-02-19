package n1ejercicio1;

import java.io.File;
import java.util.Arrays;

import DirectoryControl.Directory;

public class ListDirectory {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: insert path of your directory");
            return;
        }

        String directoryPath = System.getProperty("user.dir") + File.separator + args[0];
        File directory = Directory.validate(directoryPath);
        String[] files = directory.list();

        Arrays.sort(files, String.CASE_INSENSITIVE_ORDER);
        System.out.println(" ─" + directory.getName());
        for (String file : files) {
            System.out.println("\t└" + file);
        }
    }
}

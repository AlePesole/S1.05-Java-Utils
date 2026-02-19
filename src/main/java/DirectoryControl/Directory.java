package DirectoryControl;

import java.io.File;

public class Directory {

    public static File validate(String directoryPath) {
        if (directoryPath == null || directoryPath.isEmpty()) {
            throw new IllegalArgumentException("Directory path is null or empty: " + directoryPath);
        }

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            throw new IllegalArgumentException("Directory in: " + directoryPath + " doesn't exist");
        }
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Directory in: " + directoryPath + " is not a directory");
        }
        return directory;
    }
}

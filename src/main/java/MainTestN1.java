import n1ejercicio1.ListDirectory;
import n1ejercicio2.ListDirectoryAllFiles;
import n1ejercicio3.ListDirectoryWriteFile;
import n1ejercicio4.ListDirectoryReadFile;
import n1ejercicio5.SerializeDeserializePerson;

public class MainTestN1 {
    public static void main(String[] args) {
        // Test class
        String[] arguments = new String[] {"src/main/resources/DirectoryExample1"};

        ListDirectory.main(arguments);
        System.out.println();

        ListDirectoryAllFiles.main(arguments);
        System.out.println();

        String[] arguments2 = new String[] {"src/main/resources/DirectoryExample1",
                                            "src/main/resources/DirectoryResult.txt"};
        ListDirectoryWriteFile.main(arguments2);
        System.out.println();

        String[] arguments3 = new String[] {"src/main/resources/DirectoryResult.txt"};
        ListDirectoryReadFile.main(arguments3);
        System.out.println();

        String[] arguments4 = new String[] {"src/main/resources"};
        SerializeDeserializePerson.main(arguments4);
    }
}

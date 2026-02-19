package n1ejercicio5;

import DirectoryControl.Directory;

import java.io.*;

public class SerializeDeserializePerson {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Insert a directory path");
            return;
        }
        String directoryPath = System.getProperty("user.dir") + File.separator + args[0] + File.separator + "Person.ser";
        File directory = new File(directoryPath);

        Person person1 = new Person("Juan", 25);
        Person person2 = new Person("Pedro", 30);
        Person person3 = new Person("Maria", 40);

        serializePerson(directory, new Person[]{person1, person2, person3});
        deserializePerson(directory);
    }

    public static void serializePerson(File directory, Person[] persons) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(directory));
            oos.writeObject(persons);
            System.out.println("Persons serialized in: " + directory);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializePerson(File directory) {
        try {
            System.out.println("--Deserializing Person.ser...");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(directory));
            Person[] persons =  (Person[]) ois.readObject();
            ois.close();
            for(Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package n1ejercicio5;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    Person(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + name + ", " + age + "}";
    }
}

package packages.a;

import static packages.b.message.messaging;

public class Greeting {
    int age;
    String name;
    int salary;

    public Greeting(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        System.out.println("hello  world ");
        messaging();

    }
}

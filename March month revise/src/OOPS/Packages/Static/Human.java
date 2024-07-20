package OOPS.Packages.Static;

public class Human {
    String name;
    int age;
    int salary;
    static long population;

    public Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population+=1;
    }
}

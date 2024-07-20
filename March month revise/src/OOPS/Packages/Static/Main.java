package OOPS.Packages.Static;

public class Main {
    public static void main(String[] args) {
        Human sandeep = new Human("sandeep",22,40000);
        Human divakar = new Human("divakar",21,41000);
        System.out.println(sandeep.population);
//        System.out.println(divakar.population);
        fun();

    }
    static void fun(){
        // int static we cannot use a non static method, but in non static method we can acces static method.
        // beacuse static doesn't depend on objects.
        // non static methos is depend on objects.so we can access not static method like below.
        Main obj = new Main();
        obj.greeting();
        System.out.println("hi sandeep");
    }
    void greeting() {
        System.out.println("hello world");
    }
}

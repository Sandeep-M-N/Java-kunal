package OOPS.Packages.a;

import static OOPS.Packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("hello world");
        // when u want to access the other class function or in other package the function should be declared as public.when it is declared as private we cannot access it.
        // we should also import from other package like above, i.e import ....
        message();
    }
}

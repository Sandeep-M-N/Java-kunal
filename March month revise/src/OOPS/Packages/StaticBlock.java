package OOPS.Packages;

public class StaticBlock {
    static int a=4;
    static int b;

    // will run only once, when the first obj is create i.e when the class is loaded for the first time.
    static{
        System.out.println("hello sandeep");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock obj2= new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
    }
}

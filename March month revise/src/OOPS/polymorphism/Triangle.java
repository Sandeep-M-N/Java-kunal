package OOPS.polymorphism;

public class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("area is half * base * height");
    }
}

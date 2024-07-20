package OOPS.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes circle= new Circle();
        Triangle triangle=new Triangle();
        Square square = new Square();
        circle.area();
    }
}

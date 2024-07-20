package OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " "+ box.h);
//        BoxWeight box2= new BoxWeight();
//        System.out.println(box2.l + " "+ box2.weight);

        Box box= new BoxWeight(4,3,2,5);
        // here it access using the reference Box.
        // it is not using object BoxWeight.
        // and we cannot access box.weight because the Box constructor didn't have a weight
        System.out.println(box.l);
    }
}

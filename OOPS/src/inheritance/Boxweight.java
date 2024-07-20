package inheritance;

public class Boxweight extends Box {
    double weight;


    public Boxweight(double height, double length, double width, double weight) {
        super(height, length, width);
        this.weight = -1;
    }

    public static void main(String[] args) {
        Boxweight box1 = new Boxweight(2,4,5,6);
        System.out.println(box1.height + " "+ box1.width);
    }
}


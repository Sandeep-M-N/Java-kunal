package inheritance;

public class Boxprice extends Boxweight{
    double price;

    public Boxprice(double height, double length, double width, double weight, double price) {
        super(height, length, width, weight);
        this.price = price;
    }
}

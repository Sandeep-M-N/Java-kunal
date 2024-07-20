package OOPS.inheritance;

public class BoxWeight extends Box{
    double weight;
   public  BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor.
        // used to initialize values present in parent class.
        // it cannot be access values present in parent class as private.
        this.weight = weight;
    }
}

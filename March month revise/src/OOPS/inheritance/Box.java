package OOPS.inheritance;

public  class Box {
    // when a class is declared as final ,other class cannot inherit the properties the inherit the propeties of parent class.
    double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}

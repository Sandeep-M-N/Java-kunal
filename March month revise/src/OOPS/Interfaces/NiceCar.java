package OOPS.Interfaces;

public class NiceCar {
    private Engine engine;

    public NiceCar() {
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
}

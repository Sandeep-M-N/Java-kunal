package OOPS.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("power engine stop");
    }
}

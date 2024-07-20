package interfaces;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void start() {
        System.out.println("start");

    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}

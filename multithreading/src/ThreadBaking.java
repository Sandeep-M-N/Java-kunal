//class Cake extends Thread{
class Cake implements Runnable{
    public void run() {
        System.out.println("mixing ingredients for cake"+Thread.currentThread().getId());
        System.out.println("baking the cake"+Thread.currentThread().getId());
        System.out.println("finishing the cake"+Thread.currentThread().getId());
    }
}

public class ThreadBaking {
    public static void main(String[] args) {

        int count =4;
        for (int i = 0; i < count; i++) {
            Cake cake = new Cake();
            // if we give run method here it will not run in parallel.
            // if we give start method the steps will take place in parallel.
//            cake.run();
            Thread thread = new Thread(cake);
            thread.start();
        }

    }
}

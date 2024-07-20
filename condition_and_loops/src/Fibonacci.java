import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
//        for (int i = 3; i <=8; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.println(c);
        int count = 3;
        while(count<=num){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            count+=1;


        }

    }
}

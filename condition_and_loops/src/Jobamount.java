import java.util.Scanner;

public class Jobamount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println("enter the amount " + a);

        if (a>10000) {
            a = a + 2000;
        }
        else {
            a = a - 2000;
        }
        System.out.println(a);
    }
}

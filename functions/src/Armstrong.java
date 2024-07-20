import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        isarmstrong(n);
        if(isarmstrong(n)==n) {
            System.out.println("an arm");

        }
        else {
            System.out.println("not an arm");
        }

    }
    static int isarmstrong(int n) {
        int rem;
        int ans = 0;
        while (n > 0) {
            rem = n%10;
            ans = ans + (rem*rem*rem);
            n= n/10;

        }
        return ans;
//        if (ans==n) {
//            System.out.println("armstrong number");
//        }
//        else {
//            System.out.println("not an armstromg");
//        }

    }
}

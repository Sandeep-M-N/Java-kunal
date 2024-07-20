import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n) {
        if(n==1) {
            return true;

        }
        for (int i=2;i<n;i++) {
            if(n%i!=0){
                return true;
            }
            else {
                return false;
            }
        }
        return false;

    }

    }


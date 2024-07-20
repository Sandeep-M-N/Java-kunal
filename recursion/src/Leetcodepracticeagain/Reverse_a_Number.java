package Leetcodepracticeagain;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(rev(n));

    }
    static int rev(int n){
        int digits=(int) Math.log10(n);
        return helper(n,digits);
    }

    public static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        return(n%10*(int)(Math.pow(10,digits))+helper(n/10,digits-1));
    }

}

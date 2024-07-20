package Leetcodepracticeagain;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(digitsum(n));
    }
    static int digitsum(int n){
        if(n%10==0){
            return n;
        }
        return(n%10+digitsum(n/10));
    }
}

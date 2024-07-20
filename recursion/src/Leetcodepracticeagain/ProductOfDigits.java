package Leetcodepracticeagain;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(digitproduct(n));
    }
    static int digitproduct(int n){
        if(n==0){
            return 1;
        }
        return(n%10*digitproduct(n/10));
    }
}

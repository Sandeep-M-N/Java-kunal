package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(totalsum(1342));
    }
    static int totalsum(int n){
        if(n==0){
            return n;
        }
        return n%10 + totalsum(n/10);
    }
}

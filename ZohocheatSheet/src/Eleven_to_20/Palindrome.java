package Eleven_to_20;

public class Palindrome {
    public static void main(String[] args) {
        int n=101;
        System.out.println(is_palindrome(n));
    }
    public static String is_palindrome(int n)
    {
        // Code here
        int temp=n;
        int sum=0;
        int rem=0;
        while(temp!=0){
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        if(n==sum){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}

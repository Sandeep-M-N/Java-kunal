package Recursion;

public class Count_no_zeros {
    public static void main(String[] args) {
        int n =30204;
        System.out.println(countzero(n));
    }
    static int countzero( int n){
        int count=0;
       return helper(n,count);

    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        else{
            return helper(n/10,count);
        }
    }

}

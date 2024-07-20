package First10;

public class Twisted_prime {
    public static void main(String[] args) {
        int N=3646;
        System.out.println(isTwistedPrime(N));
    }
   public  static int isTwistedPrime(int N) {
        // code here
        int reverse=0;
        int original=N;
        while(original!=0){
            reverse=reverse*10+original%10;
            original/=10;
        }
        int ncount=0;
        int rcount=0;
        for (int i = 2; i<N/2 ; i++) {
            if(N%i==0){
                ncount=1;
                break;
            }
        }
        for (int i = 2; i < reverse/2; i++) {
            if(reverse%i==0){
                rcount=1;
                break;
            }
        }
        if (ncount==0 && rcount==0){
            return 1;
        }
        return 0;
    }
}

public class Sum_of_digits {
    public static void main(String[] args) {
        int n=1342;
        System.out.println(digitssum(n));
    }
    static int digitssum(int n){
        if(n==0){
            return 0;
        }
        return(n%10 + digitssum(n/10));
    }
}

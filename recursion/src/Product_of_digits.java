public class Product_of_digits {
    public static void main(String[] args) {
        int n=1342;
        System.out.println(digitsproduct(n));
    }
    static int digitsproduct(int n){
        if(n%10==n){
            return n;
        }
        return(n%10 * digitsproduct(n/10));
    }
}

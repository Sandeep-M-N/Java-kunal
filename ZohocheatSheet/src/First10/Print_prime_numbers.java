package First10;

public class Print_prime_numbers {
    public static void main(String[] args) {
        // to print prime numbers from 1 to n
        int n=20;
        int j=1;
        while(j<=n){
            int count=0;
            for (int i = 2; i <j ; i++) {
                if(j%i==0){
                    count=1;
                    break;
                }
                else{
                    count=0;
                }
            }
            if(count==0){
                System.out.print(j+" ");
            }
            j++;
        }
    }
}

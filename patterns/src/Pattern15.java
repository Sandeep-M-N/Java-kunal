public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1) {

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=2;k<=i;k++){
                if(k==i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                if(j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<n-i;k++){
                if(k==n-i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

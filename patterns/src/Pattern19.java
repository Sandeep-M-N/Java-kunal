public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=i;s++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

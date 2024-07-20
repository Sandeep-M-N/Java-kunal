public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n;i++){
            int col = i<n+1 ? n-i : i-n-1;
            int space = i<n+1 ? i : 2*n-i+1;
            for(int s =0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

import java.sql.SQLOutput;

public class Pattern14 {
    public static void main(String[] args) {
//        int n =5;
//        for(int i=1;i<=n;i++){
//            for(int s=1;s<i;s++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=n-i;j++){
//                if(i==1 ||j==0 ) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            for(int k=1;k<=n-i;k++){
//                if(i==1||k==n-i) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=1;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                if(i==1 ||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=n-i;k++){
                if(i==1 || k==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

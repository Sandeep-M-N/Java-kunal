import java.util.Scanner;


public class Repeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int  num = in.nextInt();
                int count  = 0;
                while(num > 0) {
                    int c = num%10;
                    num = num/10;
                    if (c==3){
                        count+=1;
                    }




                }
        System.out.println(count);
    }
}

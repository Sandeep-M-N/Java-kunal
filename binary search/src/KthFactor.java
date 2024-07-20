import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KthFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(n);

        }
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
        }
        int ans ;
        System.out.println(list);
//        for(int i=0;i< list.size();i++){
//            if(list.get(i)==k){
//               ans = i+1 ;
//            }
//
//
//        }
//        System.out.println(ans);
        if(k > list.size()){
            ans = -1;
        }
        else{
            ans= list.get(k-1);
        }
        System.out.println(ans);

    }
}

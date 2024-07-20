package First10;

import java.util.Arrays;
import java.util.HashSet;

public class Numbers_without_duplication {
    public static void main(String[] args) {
        int[] arr={131, 11, 48};
        System.out.println(Arrays.toString(common_digits(arr)));
    }
    public static int[] common_digits(int[] arr)
    {
        HashSet<Integer> ans=new HashSet<>();
        int rem=0;
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            while(temp!=0) {
                rem = temp % 10;
                ans.add(rem);
                temp/=10;
            }

        }
        int[] finalans=new int[ans.size()];
        int j=0;
        for(Integer i :ans){
            finalans[j]=i;
            j++;
        }
            return finalans;

    }
}

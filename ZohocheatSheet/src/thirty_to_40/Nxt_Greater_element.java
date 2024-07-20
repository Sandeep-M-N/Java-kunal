package thirty_to_40;

import java.util.Arrays;
import java.util.Stack;

public class Nxt_Greater_element {
    public static void main(String[] args) {
        long[] arr={7,8,1,4};
        int n=4;
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));


    }
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans=new long[arr.length];
        int temp=0;
        Stack<Integer> index=new Stack<>();
        int i=0;

        while (i<arr.length-1) {
            if (index.isEmpty()) {
                index.push(i);
            }
            else{
            if (arr[i + 1] < arr[i]) {
                index.push(i + 1);
            } else {
                while (!index.isEmpty()) {
                    temp = index.pop();
                    ans[temp] = arr[i + 1];
                }

            }
            i++;
        }


        }
        for (int j = 0; j < ans.length; j++) {
            if(ans[j]==0){
                ans[j]=-1;
            }
        }
        return ans;

    }
}

package Eleven_to_20;

import java.util.Arrays;

public class Count_triangle {
    public static void main(String[] args) {
        int[] arr={26,9,27,22,16,27};

        int n=arr.length;
        System.out.println(findNumberOfTriangles(arr,n));
    }
   public static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int count=0;
        for (int i = arr.length-1; i>=2 ; i--) {
            int l=0;
            int r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=r-l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return count;
    }
}

package First10;

import java.util.Arrays;

public class Move_zeros_to_end_of_the_array {
    public static void main(String[] args) {
        int n=5;
        int[] arr={3,5,0,0,4};
        pushZerosToEnd(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]==0){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

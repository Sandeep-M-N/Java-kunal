package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr ={3,1,5,4,2};
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n-i ; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

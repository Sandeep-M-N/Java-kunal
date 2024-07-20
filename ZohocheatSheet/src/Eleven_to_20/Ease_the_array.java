package Eleven_to_20;

import java.util.Arrays;

public class Ease_the_array {
    public static void main(String[] args) {
            int[] arr={2,2,0,4,0,8};
            int n= arr.length;
            modifyAndRearrangeArr(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        int i=0;

        while(i< arr.length-1){

                if (arr[i]==arr[i+1]){
                    arr[i]=arr[i]*2;
                    arr[i+1]=0;
                    i+=2;
                }

            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length-1; j++) {
            for (int k = j+1; k >0 ; k--) {
                if(arr[k-1]<=0){
                    swap(arr,k-1,k);
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

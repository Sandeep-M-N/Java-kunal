package Eleven_to_20;

import java.util.Arrays;

public class Missing_number {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        int n=5;
        System.out.println(missingNumber(array,n));

    }
    public static int  missingNumber(int array[], int n) {
        // Your Code Here
        int i=0;
        int missing=0;
        while(i< array.length){
            int element=array[i]-1;
            if(array[i]< array.length && array[i]!=array[element]){
                swap(array,i,element);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if(array[j]!=j+1){
                missing=j+1;
            }
        }
        return missing;
    }

    public static void swap(int[] array,int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}

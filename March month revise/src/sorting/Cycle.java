package sorting;
import java.util.Arrays;
public class Cycle {
    public static void main(String[] args) {
        int[] arr={3,5,4,1,2};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int value=arr[start]-1;
            if(arr[start]!=arr[value]){
                swap(arr,start,value);
            }
            start++;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

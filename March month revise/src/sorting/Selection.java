package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-i-1;
            int maxindex=findmax(arr,0,last);
            swap(arr,maxindex,last);

        }
        System.out.println(Arrays.toString(arr));

    }
    static int findmax(int[] arr,int start,int last){
        int max=start;
        for (int i = 0; i <=last ; i++) {
            if(arr[i]>=arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

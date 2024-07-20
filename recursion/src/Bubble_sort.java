import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr= {4,2,3,1};
        bbsort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bbsort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                // swap
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bbsort(arr,r,c+1);


        }
        else{
            bbsort(arr,r-1,0);
        }
    }
}

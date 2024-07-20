import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        int temp;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

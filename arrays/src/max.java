import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {23,45,67,21,32};
       maxarray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int maxarray(int[] arr){
        int max1=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        return max1;
    }
}

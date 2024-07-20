import java.util.Arrays;

import static java.util.Collections.swap;


public class Reverse {
    public static void main(String[] args) {
        int[] arr = {12,23,45,67,89};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){

            start++;
            end--;

        }
    }
}

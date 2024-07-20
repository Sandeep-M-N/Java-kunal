package Recursion;

public class Array_is_sort_or_not {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sort(arr));
    }
    static boolean sort(int[] arr){
         return helper(arr,0);
    }
    static boolean helper(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && helper(arr,i+1);
    }
}

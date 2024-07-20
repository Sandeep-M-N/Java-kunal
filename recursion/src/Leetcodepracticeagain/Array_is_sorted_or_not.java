package Leetcodepracticeagain;

public class Array_is_sorted_or_not {
    public static void main(String[] args) {
        int[] arr={12,24,35,47,95,67,81};
        System.out.println(sort(arr,0));

    }
    static boolean sort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return(arr[index]<arr[index+1] && sort(arr,index+1));
    }
}

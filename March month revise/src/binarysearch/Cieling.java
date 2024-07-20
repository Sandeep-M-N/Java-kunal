package binarysearch;

public class Cieling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(cielingbs(arr,target));
    }

    static int cielingbs(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;

            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return start;
    }
}

package binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,9,11,6,3,2};
        System.out.println(mountindex(arr));
    }
    static int mountindex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}

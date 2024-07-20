package binarysearch;

import com.sun.jdi.PathSearchingVirtualMachine;

public class SimpleBS {
    public static void main(String[] args) {
        int[] arr ={12,15,17,23,45};
        int target=18;
        System.out.println(bs(arr,target));

    }
    static int bs(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } if (arr[mid]<target) {
                start=mid+1;
            }
            if (arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}

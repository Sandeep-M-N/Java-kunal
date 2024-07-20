package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={98,87,76,65,54,43,32,21};
        int[] brr={21,34,56,67,78,89};
        int target=79;
        System.out.println(obs(brr,target));
    }
    static int obs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[start]>arr[end]){
                if(arr[mid]>target){
                    start=mid+1;

                }
                if(arr[mid]<target){
                    end=mid-1;
                }
                if(arr[mid]==target){
                    return mid;
                }
            }
            else {
                if(arr[mid]>target){
                    end=mid-1;
                }
                if(arr[mid]<target){
                    start=mid+1;
                }
                if(arr[mid]==target){
                    return mid;
                }
            }
        }
        return -1;
    }
}

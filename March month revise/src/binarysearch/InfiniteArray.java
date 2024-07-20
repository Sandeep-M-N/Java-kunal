package binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={5,7,11,13,27,35,45,67,76,89,90,111,121,134,157};
        int target=7;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){

                start=end+1;
                end=end*2;

        }
        return bs(arr,target,start,end);
    }
    static int bs(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-7,-3,2,5,6,7,23,34,56,78};
        int target= 34;
        int ans=binarysearch(arr,target);
        System.out.println(ans);

    }
    // return index
    //return -1 if does not exist
    static int binarysearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
           else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
}


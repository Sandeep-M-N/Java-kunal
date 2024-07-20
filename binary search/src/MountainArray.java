public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans=  fullsearch(arr,target);
        System.out.println(ans);


    }
    static int fullsearch(int[] arr,int target){
        int peak = search(arr);
        int first = orderagnosticbs(arr,target,0,peak);
        if (first!=-1){
            return first;
        }

            return orderagnosticbs(arr,target,peak,arr.length-1);


    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;

            }


        }
        return start;
    }
    static int orderagnosticbs(int[]arr,int target,int start,int end){

        boolean isasc;
        if(arr[start]<arr[end]){
            isasc=true;
        }
        else {
            isasc=false;
        }
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isasc==true){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}

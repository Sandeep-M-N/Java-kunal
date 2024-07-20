public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-12,-7,-3,2,5,6,7,23,34,56,78};
        int target= 34;
        int ans=orderagnosticbs(arr,target);
        System.out.println(ans);

    }
    static int orderagnosticbs(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
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

package binarysearch;

public class RBS {
    public static void main(String[] args) {
        int[] nums={1,3};
         int target=0;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums, int target) {
        if(nums.length==1){
            return bs(nums,target,0,nums.length-1);
        }
        int pivot=findpivot(nums);
        if(pivot==-1){
            return bs(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return bs(nums,target,0,pivot-1);
        }
        return bs(nums,target,pivot+1,nums.length-1);

    }
   static  int findpivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            if(nums[start]<=nums[mid]){
                start=mid+1;
            }
        }
        return -1;

    }
     static int bs(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

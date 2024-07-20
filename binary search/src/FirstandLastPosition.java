public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target=8;
        int ans1 = searchrange(nums,target);
        System.out.println(ans1);



    }
    static int searchrange(int[] nums, int target){
        int[] empty = {};
        int[] ans ={-1,-1};
        if(nums==empty){
            ans[0]=-1;
            ans[1]=-1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                if(nums[mid+1]==target){
                    ans[0]=mid;
                    ans[1]=mid+1;
                }
                else{
                    ans[0]=mid-1;
                    ans[1]=mid;
                }
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;

    }
}

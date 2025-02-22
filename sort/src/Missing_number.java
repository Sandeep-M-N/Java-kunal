public class Missing_number {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(cyclic(nums));
    }
    static int cyclic(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

package CycleSortproblems;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] nums={3,1,3,4,2};
        System.out.println(findDuplicate(nums));

    }
    public  static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }

        }
        int ans=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                ans=nums[j];
            }

        }
        return ans;
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

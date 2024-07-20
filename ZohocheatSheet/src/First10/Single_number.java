package First10;

import java.util.HashMap;
import java.util.Map;

public class Single_number {
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    public  static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }


        }
        for(Map.Entry<Integer,Integer> s: map.entrySet()){
            int temp=s.getValue();
            if(min>temp){
                min=temp;
                ans=s.getKey();
            }
        }
        return ans;
    }
}

public class Integerlinear {
    public static void main(String[] args) {
        int[] nums = {12,34,56,78,90,33};
        int target = 78;
        boolean ans = linearsearch(nums,target);
        System.out.println(ans);

    }
    static boolean linearsearch(int[] arr,int reach){
        if(arr.length==0){
            return false;
        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==reach){
//                return true;
//            }
//        }
        // another method
        for(int element : arr){
            if(element == reach){
                return true;
            }
        }
        return false;
    }
}

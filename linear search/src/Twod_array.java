public class Twod_array {
    public static void main(String[] args) {
        int[][] arr={
            {13,34,56},
            {23,45,78},
            {65,54,21}
        };
        int target = 45;
        System.out.println(search(arr,target));
    }
    static boolean search(int[][] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

package Recursion;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr={12,32,45,65,78,99};
        int target=67;
        System.out.println(linear(arr,target,0));
    }
    static boolean linear(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        else{
            return linear(arr,target,index+1);
        }
    }
}

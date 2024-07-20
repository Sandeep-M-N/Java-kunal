public class Array_is_sorted_or_not {
    public static void main(String[] args) {
       int[] arr={1,2,9,8};
        System.out.println(sort(arr));

    }
    static boolean sort(int[] n){

        return helper(n,0);
    }
    static boolean helper(int[] n,int i){
        if(i==n.length-1){
            return true;
        }
        return n[i]<n[i+1] && helper(n,i+1);
    }
}

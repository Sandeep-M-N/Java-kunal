public class Steps_to_reduce_a_no_to_zero {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    static int steps(int n){
        return helper(n,0);
    }
    static int helper(int n,int s){
        if(n==0){
            return s;
        }
        if(n%2==0){
            return helper(n/2,s+1);
        }
        else{
            return helper(n-1,s+1);
        }
    }
}

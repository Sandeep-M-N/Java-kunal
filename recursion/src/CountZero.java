public class CountZero {
    public static void main(String[] args) {
        int count=0;
//        System.out.println(countzer0(30204,count));
        System.out.println(count2(303020));
    }
    static int countzer0(int n ,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem!=0){
            return countzer0(n/10,count);
        }
        else{
            return countzer0(n/10,count+1);
        }
    }
    static int count2(int n){
        return helper(n,0);

    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }
}

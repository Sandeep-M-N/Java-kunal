public class Sqr {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mysqrt(x));

    }
    static int mysqrt(int x){
        if(x==0){
            return x;
        }
        int ans =0;
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid*mid==x){
                ans= mid ;
            }
            else if(mid*mid>x){
                end=mid-1;
            }
            else{
                start = mid+1;
                ans = mid;
            }

        }
        return ans;
    }
}

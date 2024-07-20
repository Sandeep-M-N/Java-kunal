public class MagicNo {
    public static void main(String[] args) {
        int n=6;
        System.out.println(findmagic(n));
    }
    static int findmagic(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last = n&1;
            n=n>>1;
            ans = ans + last * base;
            base= base*5;
        }
        return ans;
    }
}

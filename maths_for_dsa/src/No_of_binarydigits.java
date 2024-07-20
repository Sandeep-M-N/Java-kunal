public class No_of_binarydigits {
    public static void main(String[] args) {
        int n=6;
//        int count=0;
//        while(n>0){
//            int last=n & 1;
//            count++;
//            n=n>>1;
//        }
//        System.out.println(count);
        // using formula
        int b =2;
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}

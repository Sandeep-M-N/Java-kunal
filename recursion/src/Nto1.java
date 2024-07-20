public class Nto1 {
    public static void main(String[] args) {
        int n=5;

        numbers(n);
    }
    // this code is for N to 1
//    static void numbers(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        numbers(n-1);
//    }

    // this code is for 1 to N;
    static void numbers(int n){
        if(n==0){
            return;
        }
        numbers(n-1);
        System.out.println(n);
    }
}

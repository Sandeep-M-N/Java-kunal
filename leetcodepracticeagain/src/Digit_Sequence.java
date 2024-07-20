import java.util.ArrayList;

public class Digit_Sequence {
    public static void main(String[] args) {
//        System.out.println(seq("","121"));
        seq2("","1234");

    }
//    static ArrayList<String> seq(String p,String up){
//        if(up.isEmpty()){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        char ch=up.charAt(0);
//
//        ArrayList<String>left=seq(p+ch,up.substring(1));
//        ArrayList<String>right=seq(p,up.substring(1));
//        left.addAll(right);
//        return left;
//    }
    static void seq2(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
//        char ad = up.charAt(1);
        int a = Integer.parseInt(String.valueOf(ch));
//        int b=Integer.parseInt(String.valueOf(ad));
        if(up.length()>=2) {

            String comb = up.substring(0, 2);

            int b = Integer.parseInt(comb);
            if(b<=26) {


                char ans1 = (char) (b + 64);
                seq2(p + ans1, up.substring(2));
            }
        }


            char ans2 = (char) (a + 64);
            seq2(p + ans2, up.substring(1));


//        static void subseq(String p,String up){
//            if(up.isEmpty()){
//                System.out.println(p);
//                return;
//            }
//            char ch = up.charAt(0);
//            subseq(p+ch,up.substring(1));
//            subseq(p,up.substring(1));
//        }}
    }
}

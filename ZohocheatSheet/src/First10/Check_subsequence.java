package First10;

public class Check_subsequence {
    public static void main(String[] args) {
        String a="AXY";
        String b="YADXCP";
        System.out.println(isSubSequence(a,b));
    }

   public static boolean isSubSequence(String A, String B){
       char[] bin=B.toCharArray();
       int count=0;
       int Acount=0;
       for (int i = 0; i < bin.length; i++) {
           if(Acount<A.length()) {
               if (bin[i]==A.charAt(Acount)) {
                   count++;
//                   if (Acount < A.length()) {
                       Acount++;
//                   }


               }
           }
           else{
               break;
           }
       }
       if(count==A.length()){
           return true;
       }
       else {
           return false;
       }

    }
}

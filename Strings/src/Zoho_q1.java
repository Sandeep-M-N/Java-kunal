public class Zoho_q1 {
    public static void main(String[] args) {
        System.out.println(zoho("a1b2c3d4"));
    }
    static String zoho(String str){
        String ans="";
        int start=0;
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                int n=str.charAt(i)-'0';
                while(start<n){
                    ans+=str.charAt(i-1);
                    start++;
                }
            }
            start=0;
        }

        return ans;
    }
}

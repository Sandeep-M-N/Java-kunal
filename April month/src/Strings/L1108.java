package Strings;

public class L1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        char ch='.';
        String insert="[.]";
        for (int i = 0; i < address.length(); i++) {
               if(address.charAt(i)==ch){
                   ans.append(insert);
               }
               else{
                   ans.append(address.charAt(i));
               }

        }
        return ans.toString();
    }
}

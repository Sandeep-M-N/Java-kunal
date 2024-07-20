package practice;

public class Practice {
    public static void main(String[] args) {
        String s = "ababc";
        String r = "ab";
        int i=0;
        int j=0;

        while(i<s.length() && i<r.length()){
            if(s.charAt(i)==r.charAt(i)){
                i++;
                if(r.charAt(i)==r.length()-1){
                    j++;
                    s=s.substring(i,s.length());
                    i=0;
                }
            }
            else {
                s = s.substring(i + 1, s.length());
            }
        }
        System.out.println(j);
    }
}

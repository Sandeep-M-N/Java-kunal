package leetcode;

public class L1768 {
    public static void main(String[] args) {
        System.out.println( mergeAlternately("ab","pqrs"));
    }
    public static  String mergeAlternately(String word1, String word2) {
        StringBuilder ans= new StringBuilder();
        int i=0;

            while(i<word1.length() && i<word2.length()){
                ans.append(word1.charAt(i));
                ans.append(word2.charAt(i));

                i++;
            }
            if(i<word1.length()){
                for(int k=i;k<word1.length();k++){
                    ans.append(word1.charAt(k));
                }
            }
            if(i<word2.length()){
                for(int k=i;k<word2.length();k++){
                    ans.append(word2.charAt(k));
                }

            }
            return ans.toString();

    }
}

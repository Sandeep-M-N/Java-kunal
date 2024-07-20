package leetcode;

public class L557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String k : words) {
            StringBuilder wordssb = new StringBuilder();

            wordssb.append(k + " ");
            wordssb.reverse();
            result.append(wordssb);
        }
        result.reverse();

        return result.toString();


    }
}

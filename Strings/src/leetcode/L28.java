package leetcode;

public class L28 {
    public static void main(String[] args) {
        System.out.println(strStr( "sadbutsad","das"));

    }
    public  static int strStr(String haystack, String needle) {
        int ans;
        ans = haystack.indexOf(needle);
//        if (ans > -1) {
//            return ans;
//        }
//
//        return -1;
        return ans;
    }
}

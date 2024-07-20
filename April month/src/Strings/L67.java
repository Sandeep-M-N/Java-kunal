package Strings;

public class L67 {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int first=Integer.parseInt(a,2);
        int second=Integer.parseInt(b,2);
        int total=first+second;
//        String ans=Integer.toBinaryString(total);
        return Integer.toBinaryString(total);
    }
}

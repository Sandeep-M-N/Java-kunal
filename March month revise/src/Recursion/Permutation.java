package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String up="abc";
        String p="";
        System.out.println(permutlist(p,up));
        System.out.println(permutcount(p,up));
    }
    static void permut(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i,p.length());
            permut(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0,i);
            String s= p.substring(i,p.length());
           ans.addAll( permutlist(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    static int permutcount(String p,String up) {
        if (up.isEmpty()) {

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutcount(f + ch + s, up.substring(1));
        }
        return count;
    }

}

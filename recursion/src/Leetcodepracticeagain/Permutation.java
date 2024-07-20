package Leetcodepracticeagain;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutaion("","abc");
        System.out.println(permutation2("","abc"));

    }
    static void permutaion(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            permutaion(f+ch+l,up.substring(1));

        }
    }
    static ArrayList<String> permutation2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            ans.addAll(permutation2(f+ch+l,up.substring(1)));

        }
        return ans;

    }
}

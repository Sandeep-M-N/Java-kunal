package Recursion;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        String up="12";
        String p="";
//        letter(p,up);
        System.out.println(letterlist(p,up));

    }
    static void letter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < (digit)*3; i++) {
            char ch= (char)('a'+i);
            letter(p+ch,up.substring(1));

        }

    }
    static ArrayList<String> letterlist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch=(char)('a'+i);
            ans.addAll(letterlist(p+ch,up.substring(1)));


        }
        return ans;
    }
}

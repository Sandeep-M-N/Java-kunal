package Leetcodepracticeagain;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(keypad("","72"));

    }
    static ArrayList<String> keypad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        if(digit==7){
            for (int i =(digit-2)*3; i <=(digit-1)*3 ; i++) {
                char ch= (char) ('a'+i);
                ans.addAll(keypad(p+ch,up.substring(1)));

            }

        }
        if(digit==8){
            for (int i =(digit-2)*3+1; i <=(digit-1)*3 ; i++) {
                char ch= (char) ('a'+i);
                ans.addAll(keypad(p+ch,up.substring(1)));

            }

        }
        if(digit==9){
            for (int i =(digit-2)*3+1; i <=(digit-1)*3+1 ; i++) {
                char ch= (char) ('a'+i);
                ans.addAll(keypad(p+ch,up.substring(1)));

            }

        }
        if(digit>=2 && digit<=6) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(keypad(p + ch, up.substring(1)));

            }
        }
        return ans;

    }
}

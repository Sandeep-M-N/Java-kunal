package Strings;

import java.util.HashMap;

public class L13 {
    public static void main(String[] args) {
            String s ="MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> roman = new HashMap<>();
        int total=0;
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for (int i = 0; i < s.length(); i++) {
            if(i<s.length()-1  && roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){

                    total -= roman.get(s.charAt(i));



            }
            else{
                total+=roman.get(s.charAt(i));
            }


        }
        return total;
    }
}

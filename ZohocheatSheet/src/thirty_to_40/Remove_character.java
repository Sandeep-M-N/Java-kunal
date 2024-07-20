package thirty_to_40;

import java.util.ArrayList;

public class Remove_character {
    public static void main(String[] args) {
        String s1="occurrence";
        String s2="car";
        System.out.println(removeChars(s1,s2));
    }
    static String removeChars(String string1, String string2){
        // code here
        ArrayList<Character> list= new ArrayList<>();
        String ans="";
        for (int i = 0; i < string1.length(); i++) {
            list.add(string1.charAt(i));
        }
        for (int i = 0; i < string2.length(); i++) {
            int j=0;
            while(j< list.size()) {
                if(string2.charAt(i)==list.get(j)){
                    list.remove(j);
                }
                else{
                    j++;
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            ans+=list.get(i);
        }
        return ans;

    }
}

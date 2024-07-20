package Eleven_to_20;

import java.util.ArrayList;

public class Word_break {
    public static void main(String[] args) {
        int n=6;
        String s="ilike";
       ArrayList<String> dictionary =  new ArrayList<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        System.out.println(wordBreak(n,s,dictionary));
    }
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code her
        int length=s.length();
        int count=0;
        for (int i = 0; i < dictionary.size(); i++) {
            String temp= dictionary.get(i);
            if(s.contains(temp)){
                count+=temp.length();
                if(count==length){
                    break;
                }
            }
        }
        if(count==length){
            return 1;
        }
        return 0;
    }
}

package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1859 {
    public static void main(String[] args) {
       String s ="is2 sentence4 This1 a3";


        System.out.println(sortSentence(s));


    }
    public  static String sortSentence(String s) {
        String[] arr = s.split(" ");
        int[] num= new int[arr.length];
        String[] finalans = new String[arr.length];

        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                int digit=s.charAt(i)-'0';
                num[count]=digit;
                count+=1;

            }



        }
        int temp=0;

        for (int i = 0; i < num.length; i++) {
               temp=num[i];
               finalans[temp-1]=arr[i];

        }
        String last="";
        for (int i = 0; i < finalans.length ; i++) {
            for (int j = 0; j < finalans[i].length(); j++) {
                if(finalans[i]==finalans[finalans.length-1]){
                    if (Character.isDigit(finalans[i].charAt(j))){
                        break;
                    }
                    else{
                        last+=finalans[i].charAt(j);
                    }
                }
                else{
                       if(Character.isDigit(finalans[i].charAt(j))){

                           last+=" ";
                       }
                       else{
                           last+=finalans[i].charAt(j);
                       }
                }
            }


        }
        return last;


    }

}

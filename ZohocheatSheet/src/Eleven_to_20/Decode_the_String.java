package Eleven_to_20;

import java.util.Stack;

public class Decode_the_String {
    public static void main(String[] args) {
      String s=  "3[b2[ca]]";
        System.out.println(decodedString(s));
    }
     public static String decodedString(String s){
        // code her
         Stack<Integer> counts=new Stack<>();
         Stack<String> result= new Stack<>();
         int i=0;

         String res="";
         while(i<s.length()){
             if(Character.isDigit(s.charAt(i))){
                 int count=0;
                 while(Character.isDigit(s.charAt(i))){
                     count=count*10+(s.charAt(i)-'0');
                     i++;
                 }
                 counts.push(count);

             } else if (s.charAt(i)=='[') {
                 result.push(res);
                 res="";
                 i++;
             } else if (s.charAt(i)==']') {
                 int count=0;
                 StringBuilder temp=new StringBuilder(result.pop());
                 count=counts.pop();
                 for (int j = 0; j <count ; j++) {
                     temp.append(res);

                 }
                 res= temp.toString();
                 i++;
             }
             else{
                 res+=s.charAt(i);
                 i++;
             }
         }
         return res;

    }
}

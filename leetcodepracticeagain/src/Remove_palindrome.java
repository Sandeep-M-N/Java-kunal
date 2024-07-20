import java.util.Arrays;

public class Remove_palindrome {
    public static void main(String[] args) {
        String s= "Hari speaks malayalam";
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));
        String ans="";

        for (int i = 0; i < str.length; i++) {
            int start=0;
            int end=str[i].length()-1;
            int count=0;
            while(start<=end){
                if(str[i].charAt(start)!=str[i].charAt(end)){
                    count=1;
                    break;

                }
                else{
                    start++;
                    end--;
                }
            }
            if(count==1){
                ans+=str[i]+" ";
            }


        }
        System.out.println(ans);
    }
}

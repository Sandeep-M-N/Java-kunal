// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String s= "malayalam is my language";
       String[] str = s.split(" ");
       String ans="";
        boolean temp=false;
        for (int i = 0; i < str.length; i++) {
            int start=0;
            int end=str[i].length();
            while(start<end){
                if(str[i].charAt(start)!=str[i].charAt(end)){
                    temp=true;
                    break;
                }
                else{
                    start++;
                    end--;
                }
            }
            if(temp==true){
                ans+=str[i];
            }
        }
        System.out.println(ans);
    }
}
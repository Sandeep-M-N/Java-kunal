package Leetcodepracticeagain;

public class Skipacharcter {
    public static void main(String[] args) {
        String up="baaaccdefa";
        String p ="";
//        skip(p,up);
        System.out.println(skip2(up));

    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)=='a'){
            skip(p, up.substring(1));
        }
        else{
             skip(p+up.charAt(0),up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip2(up.substring(1));
        }
        return ch+skip2(up.substring(1));
    }
}

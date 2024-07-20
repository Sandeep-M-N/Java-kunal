package Recursion;

public class Skip_a_character {
    public static void main(String[] args) {
        String up="bappleccappd";
        String p="";
        char ch='a';
//        skip(up,p,ch);
        System.out.println(skipappnotapple(up));


    }
    static void skip(String up,String p,char ch){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)!=ch){
            skip(up.substring(1),p+up.charAt(0),ch);
        }
        else{
            skip(up.substring(1),p,ch);
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch!='a'){
            return  ch + skip2(up.substring(1));
        }
        else{
            return skip2(up.substring(1));
        }
    }
    static String skipapple(String up){
        if(up.isEmpty()){
            return "";

        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipapple(up.substring(1));
        }

    }
    static String skipappnotapple(String up){
        if(up.isEmpty()){
            return "";

        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappnotapple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipappnotapple(up.substring(1));
        }

    }
}

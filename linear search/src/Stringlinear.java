import java.util.Arrays;

public class Stringlinear {
    public static void main(String[] args) {
        String str = "sandeep";
        char target = 'p';
        System.out.println(stringsearch(str,target));
    }
    static boolean stringsearch(String atr,char reach){
        if(atr.length()==0){
            return false;
        }
//        for(int i=0;i<atr.length();i++){
//            if(atr.charAt(i)==reach){
//                return true;
//            }
//        }
        // another method
        for(int element : atr.toCharArray()){
            if(element == reach){
               return true;
            }
        }
        return false;
    }
}

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        System.out.println(pad2("","19"));

    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit= up.charAt(0)-'0'; // this will convert into '1' to 1
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char) ('a' + i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> pad2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit=up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i =(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(pad2(p+ch,up.substring(1)));
        }
        return list;
    }
}

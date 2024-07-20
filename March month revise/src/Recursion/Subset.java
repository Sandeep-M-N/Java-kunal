package Recursion;

import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {
        String up="abc";
        String p="";
//        subset(p,up);
        System.out.println(subset2(p,up));
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0),up.substring(1));
        subset(p,up.substring(1));
    }
    static ArrayList<String> subset2(String p,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        ArrayList<String> left=subset2(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=subset2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}

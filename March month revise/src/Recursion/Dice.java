package Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int target=4;
        String p="";
//        dice(p,target);
        System.out.println(dicelist(p,target));
    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> dicelist(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i<=target;i++){
            ans.addAll(dicelist(p+i,target-i));
        }
        return ans;
    }
}

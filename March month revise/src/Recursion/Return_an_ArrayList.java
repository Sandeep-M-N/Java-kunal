package Recursion;

import java.util.ArrayList;

public class Return_an_ArrayList {
    public static void main(String[] args) {
        int[] arr={3,2,5,6,3,8};
        int target=3;
        System.out.println(listindex2(arr,target, 0));
    }
    static ArrayList<Integer> listindex(int[] arr,int target,int index ,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

            return listindex(arr,target,index+1,list);

    }
    static ArrayList<Integer> listindex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans = listindex2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}


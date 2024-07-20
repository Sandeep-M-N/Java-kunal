package Leetcodepracticeagain;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,9,23};
        int target=9;
        System.out.println(findindex(arr,target,0));

    }
    static int search(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return search(arr, target, index + 1);
        }

    }
    static ArrayList<Integer> findindex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans = findindex(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}

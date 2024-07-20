package Eleven_to_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class sort_no_basis_of_factors {
    public static void main(String[] args) {
        int[] arr={5, 11, 10, 20, 9, 16, 23};
        System.out.println(Arrays.toString(sortbasisonfactors(arr)));

    }
    public static int[] sortbasisonfactors(int[] arr){
        int[] ans=new int[arr.length];
        int[] factors=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 1; j <=arr[i] ; j++) {
                if(arr[i]%j==0){
                    count++;
                }
            }
            factors[i]=count;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(factors[i],arr[i]);
        }
        Arrays.sort(factors);
        reverse(factors);
        for (int i = 0; i < factors.length; i++) {
            ans[i]= map.get(factors[i]);
        }
        return ans;

    }
    public  static void reverse(int[] factors){
        for (int i = 0; i < factors.length/2; i++) {
            int temp=factors[i];
            factors[i]=factors[factors.length-i-1];
            factors[factors.length-i-1]=temp;
        }
    }
}

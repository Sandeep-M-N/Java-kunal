package Eleven_to_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Diagonal_sorting {
    public static void main(String[] args) {
        int[][] arr={
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        System.out.println(Arrays.toString(diagonalSort(arr)));

    }
    public  static int[][] diagonalSort(int[][] mat) {
            int[][] ans =new int[mat.length][mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            int rindex=0;
            int cindex=i;
            while(rindex< mat.length && cindex<mat[0].length){
                temp.add(mat[rindex][cindex]);
                rindex++;
                cindex++;
            }
            Collections.sort(temp);
            rindex=0;
            cindex=i;
            while (rindex< mat.length && cindex<mat[0].length){
                ans[rindex][cindex]= temp.get(rindex);
                rindex++;
                cindex++;
            }
        }
        for (int i = 1; i < mat.length; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            int rindex=i;
            int cindex=0;
            while(rindex< mat.length && cindex< mat[0].length){
                temp.add(mat[rindex][cindex]);
                rindex++;
                cindex++;
            }
            Collections.sort(temp);
            rindex=i;
            cindex=0;
            while (rindex< mat.length && cindex< mat[0].length){
                ans[rindex][cindex]= temp.get(cindex);
                rindex++;
                cindex++;
            }
        }
        return  mat;
    }
}

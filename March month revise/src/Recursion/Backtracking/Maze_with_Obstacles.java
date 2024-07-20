package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze_with_Obstacles {
    public static void main(String[] args) {
        boolean[][] matrix={
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        System.out.println(pathrestrictions("",matrix,0,0));
    }
    static ArrayList<String> pathrestrictions(String p,boolean[][] matrix,int r,int c){
        if(r==matrix.length-1 && c==matrix[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(matrix[r][c]==false){
            return list;
        }
        if(r<matrix.length-1){
            list.addAll(pathrestrictions(p+'D',matrix,r+1,c));
        }
        if(c< matrix[0].length-1){
            list.addAll(pathrestrictions(p+'R',matrix,r,c+1));
        }
        return list;
    }
}

package Recursion.Backtracking;

import java.io.StringBufferInputStream;
import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        System.out.println(pathdiagonal("",3,3));

    }
    static int mazecount(int r,int c){
        if(r==1|| c==1){
            return 1;

        }

       int left=mazecount(r-1,c);
       int right=mazecount(r,c-1);
       return left + right;
    }
    static ArrayList<String> maze(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1) {
            list.addAll(maze(p + 'D', r - 1, c));
        }
        if(c>1) {
            list.addAll(maze(p + 'R', r, c - 1));
        }
        return list;

    }
    static ArrayList<String> pathdiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList< String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathdiagonal(p+'d',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathdiagonal(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathdiagonal(p+'R',r,c-1));
        }
        return list;
    }
}

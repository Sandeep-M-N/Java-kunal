package Leetcodepracticeagain;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(0,0));
        System.out.println(path("",0,0));

    }
    static int maze(int r,int c){
        if(r==2 || c==2){
            return 1;
        }
        int left=maze(r+1,c);
        int right=maze(r,c+1);
        return left + right;
    }
    static ArrayList<String> path(String p,int r,int c){
        if(r==2 && c==2){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r<2){
           ans.addAll(path(p+'d',r+1,c));
        }
        if(c<2){
           ans.addAll(path(p+'r',r,c+1));
        }
        return ans;


    }
}

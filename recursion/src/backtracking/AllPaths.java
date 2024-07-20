package backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        int[][] path= new int[maze.length][maze[0].length];
        allpath("",maze,0,0);
//        allpathstep("",maze,0,0,path,1);

    }
    static void allpath(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            allpath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allpath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allpath(p+'u',maze,r-1,c);
        }
        if(c>0){
            allpath(p+'l',maze,r,c-1);
        }
        //this line is where the function is over
        // so before the function gets removed,also remove the changes that were made by the function
        maze[r][c]=true;
    }
    static void allpathstep(String p,boolean[][] maze,int r,int c, int[][] path,int step){
        if(r== maze.length-1 && c==maze[0].length-1){
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r< maze.length-1){
            allpathstep(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allpathstep(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allpathstep(p+'u',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allpathstep(p+'l',maze,r,c-1,path,step+1);
        }
        //this line is where the function is over
        // so before the function gets removed,also remove the changes that were made by the function
        maze[r][c]=true;
        path[r][c]=0;
    }
}

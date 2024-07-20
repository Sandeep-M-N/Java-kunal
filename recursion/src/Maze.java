import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        path("",3,3);
//        System.out.println(path2("",3,3));
//        System.out.println(pathdiagonal("",3,3));
        boolean[][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        pathrestrictions("",maze,0,0);

    }
    static int maze(int r,int c) {
        if(r==1 || c==1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);
        return left + right;
    }
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> path2(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1){
            list.addAll(path2(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(path2(p+'R',r,c-1));

        }
        return list;

    }

    static ArrayList<String> pathdiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathdiagonal(p+'d',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathdiagonal(p+'v',r-1,c));
        }
        if(c>1){
            list.addAll(pathdiagonal(p+'h',r,c-1));

        }
        return list;

    }
    static void pathrestrictions(String p, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]== false){
            return;
        }
        if(r<maze.length-1){
            pathrestrictions(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathrestrictions(p+'R',maze,r,c+1);
        }
    }


}

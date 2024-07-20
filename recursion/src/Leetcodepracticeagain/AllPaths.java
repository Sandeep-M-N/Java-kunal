package Leetcodepracticeagain;

public class AllPaths {
    public static void main(String[] args) {
        int[][] matrix={
                {1,0,0,1},
                {1,0,1,0},
                {1,1,1,0},
                {0,1,1,1}
        };
//        allpaths(matrix,"",0,0);
        System.out.println(allpathstepscount(matrix,2,0,3,3));


    }
    static void allpaths(int[][] matrix,String p,int r,int c){
        if(r==matrix.length-1 && c==matrix.length-1){
            System.out.println(p);
            return;
        }
        if(matrix[r][c]==0){
            return;
        }
        matrix[r][c]=0;
        if(r< matrix.length-1){
            allpaths(matrix,p+'d',r+1,c);
        }
        if(c< matrix.length-1){
            allpaths(matrix,p+'r',r,c+1);

        }
        if(r>0){
            allpaths(matrix,p+'u',r-1,c);
        }
        if(c>0){
            allpaths(matrix,p+'l',r,c-1);
        }
        matrix[r][c]=1;

    }
    static int allpathstepscount(int[][]matrix,int sr,int sc,int er,int ec){
        if(sr==er && sc==ec){

            return 1;
        }
        int count=0;
        if(matrix[sr][sc]==0){
            return 0;
        }
        matrix[sr][sc]=0;
        if(sr<matrix.length-1){
            count=count+allpathstepscount(matrix,sr+1,sc,er,ec);
        }
        if(sc<matrix[sr].length-1){
           count=count+ allpathstepscount(matrix,sr,sc+1,er,ec);
        }
        if(sr>0){
            count=count+allpathstepscount(matrix,sr-1,sc,er,ec);
        }
        if(sc>0){
           count=count+ allpathstepscount(matrix,sr,sc-1,er,ec);
        }
        matrix[sr][sc]=1;
        return count;


    }
}

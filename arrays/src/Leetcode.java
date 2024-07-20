import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[][] mat={
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int[][] ans = new int[mat.length][mat.length];
        int start=mat.length-1;
        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat.length;j++){
                ans[i][j]=mat[start][j];
//                mat[i][j]=ans[i][j];

            }
            start--;

        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        if(Arrays.equals(ans,mat)){
            System.out.println("false");
        }
        else{
            System.out.println("true" );
        }


        }
    }


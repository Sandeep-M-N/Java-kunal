import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,0},
                {1,0,0},
                {1,0,0},
                {0,0,0}
        };

        rowcol(matrix);
        for (int[] a: matrix){
            System.out.println(Arrays.toString(a));
        }







    }
    public static void rowcol(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==1) {
                    int col=0;
                    while(col<=matrix[i].length-1){
                        if(matrix[i][col]==1){
                            col++;
                        }
                        if(matrix[i][col]==0){
                            matrix[i][col]=2;
                            col++;
                        }
                    }
                    int row=0;
                    while(row<=matrix[i].length-1){
                        if(matrix[row][j]==1){
                            row++;
                        }
                        if(matrix[row][j]==0){
                            matrix[row][j]=2;
                            row++;
                        }
                    }
                }

            }


        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==2){
                    matrix[i][j]=1;
                }

            }

        }
    }
}

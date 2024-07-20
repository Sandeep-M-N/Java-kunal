import java.util.Arrays;
import java.util.Scanner;

public class Twodimensional {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 1, 0}
        };

        // input
//        for (int row =0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                arr[row][col]= in.nextInt();
//
//
//            }
//
//        }
        // output
//        for (int row =0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//
//                System.out.print(arr[row][col] + " ");
//
//
//            }
//            System.out.println();
//
//        }
        // enhanced output
//        for(int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
        for (int i = 0; i < arr.length; i++) {
             int temp= (arr.length) -1;
            for (int j = 0; j < arr[i].length; j++) {
                int duplicate= arr[i][j];


                arr[i][j] = arr[i][temp];
                arr[i][temp]=duplicate;
                temp--;
            }
            temp=0;

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }

//
    }


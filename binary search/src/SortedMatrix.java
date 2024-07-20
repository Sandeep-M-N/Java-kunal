import java.util.Arrays;

public class SortedMatrix {
//    public static void main(String[] args) {
//        int[][] matrix= {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//        int target =3;
//        System.out.println(Arrays.toString(search(matrix,target)));
//
//    }
//    static int[] sbs(int[][]matrix,int row,int cstart,int cend,int target){
//        while(cstart<=cend){
//            int mid = cstart + (cend-cstart)/2;
//            if(matrix[row][mid]==target){
//                return new int[]{row,mid};
//            } else if (matrix[row][mid]<target) {
//                cstart=mid+1;
//
//            }
//            else{
//                cend=mid-1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    static int[] search(int[][] matrix,int target){
//        int rows= matrix.length;
//        int cols=matrix[0].length;
//        if(cols==0){
//            return new int[]{-1,-1};
//        }
//        if (rows==1){
//            return sbs( matrix,0,0,cols-1, target);
//        }
//        int rstart=0;
//        int rend=rows-1;
//        int cmid=cols/2;
//        while(rstart<(rend-1)){
//           int mid = rstart+(rend-rstart)/2;
//           if(matrix[mid][cmid]== target){
//               return new int[]{mid,cmid};
//           }
//           if(matrix[mid][cmid]<target){
//               rstart=mid;
//           }
//           else{
//               rend=mid;
//           }
//        }
//        if (target <= matrix[rstart][cmid - 1]) {
//            return sbs(matrix, rstart, 0, cmid-1, target);
//        }
//        // search in 2nd half
//        if (target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
//            return sbs(matrix, rstart, cmid + 1, cols - 1, target);
//        }
//        // search in 3rd half
//        if (target <= matrix[rstart + 1][cmid - 1]) {
//            return sbs(matrix, rstart + 1, 0, cmid-1, target);
//        } else {
//            return sbs(matrix, rstart + 1, cmid + 1, cols - 1, target);
//        }
//
//
//    }
//}
public static void main(String[] args) {
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    System.out.println(Arrays.toString(search(arr, 9)));
}

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
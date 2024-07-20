import java.util.ArrayList;

public class Lucky_no_in_a_matrix {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        for(int i=0;i<arr.length;i++){
            int minindex = 0;
            int min = 1234567;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    minindex=j;

                }



            }
            int max =0;
            for(int k=0;k< arr.length;k++){
                if(arr[k][minindex]>max){
                    max = arr[k][minindex];
                }
            }
            if(min==max){
                list.add(max);
            }
        }
        System.out.println(list);



    }
}

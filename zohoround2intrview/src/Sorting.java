import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={2,3,2,4,5,12,2,3,3,3,12};
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int ostart=0;
        int estart= arr.length;
        while (ostart<=estart) {
            int start=0;
            int end= arr.length-1;
            int count=-0;
            while(start<=end){
                if(arr[start]==arr[ostart]){
                    count+=1;
                }
                if(arr[start]!=arr[ostart]){
                    ostart=start;
                    break;
                }

                start++;

            }
            list.add(count);

        }
        System.out.println(list);
    }
}

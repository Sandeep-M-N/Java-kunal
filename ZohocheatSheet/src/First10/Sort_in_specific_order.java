package First10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort_in_specific_order {
    public static void main(String[] args) {
            long[] arr ={0, 4, 5, 3, 7, 2, 1};
            sortit(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortit(long[] arr,long n){
        ArrayList<Long> odd= new ArrayList<>();
        ArrayList<Long> even=new ArrayList<>();
        for (int i = 0; i < n; i++) {
                if(arr[i]%2==0){
                    even.add(arr[i]);
                }
                else{
                    odd.add(arr[i]);
                }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        int k=0;

        for(Long i:odd){
            arr[k++]=i;
        }
        for(Long j:even){
            arr[k++]=j;
        }



        }

    }


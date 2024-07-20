import java.util.ArrayList;
import java.util.Arrays;

// we need to sort odd numbers in the array in ascending order & even numbers in descending order
public class Sort_in_as_and_ds {
    public static void main(String[] args) {
        int[] arr={5,8,11,6,2,1,7};
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxindex=findmax(arr,0,last);
            swap(arr,maxindex,last);
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                odd.add(arr[i]);
            }
            else{
                even.add(arr[i]);

            }

        }
        System.out.println(odd);
        System.out.println(even);
        int [] ans = new int[odd.size()+ even.size()];
        int start=0;
        int end= even.size()-1;
        while(start< odd.size()){
            ans[start]= odd.get(start);
            start++;
        }
        int estart=0;
        while(end>=0){
            ans[start]=even.get(end);
            start++;
            end--;

        }
        System.out.println(Arrays.toString(ans));
    }
    static int findmax(int[] arr,int first,int last){
        int max=0;
        for (int i = first; i <=last ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


}

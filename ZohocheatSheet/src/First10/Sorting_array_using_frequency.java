package First10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sorting_array_using_frequency {
    public static void main(String[] args) {
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();
        for (int i = 0; i < input; i++) {


            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int arrinput = in.nextInt();
                arr[j] = arrinput;
//                if (!map.containsKey(arrinput)) {
//                    map.put(arrinput, 1);
//                } else {
//                    map.put(arrinput, map.get(arrinput)+ 1));
//                }

            }
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int k = 0; k < arr.length; k++) {
                if (!map.containsKey(arr[k])) {
                    map.put(arr[k], 1);
                } else {
                    map.put(arr[k], map.get(arr[k])+ 1);
                }
            }
            System.out.println(map);
            arrange(map);
            System.out.println();
        }

    }
    public static void arrange(HashMap<Integer,Integer> map){
        int maxkey=-1;
        int maxvalue=-1;
        while(map.size()!=0){
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(maxvalue< entry.getValue()){
                    maxvalue= entry.getValue();
                    maxkey= entry.getKey();
                }
                if(maxvalue==entry.getValue()){
                   maxkey=(maxkey>entry.getKey()? entry.getKey() : maxkey);

                }
            }
            print(maxkey,maxvalue);
              map.remove(maxkey);
            maxkey=-1;
            maxvalue=-1;
        }
    }
    public static void print(int maxkey,int maxvalue){
        for (int i = 0; i < maxvalue; i++) {
            System.out.print(maxkey+" ");
        }
    }

}

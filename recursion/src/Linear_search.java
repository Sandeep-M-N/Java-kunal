import java.util.ArrayList;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,8,6,8,9,11};
        int target= 8;
//        findindex(arr,target,0);
//        System.out.println(list);
        System.out.println(findallindex2(arr,target,0));


    }
    static boolean linear(int[] n,int target,int index){
        if(index==n.length){
            return false;
        }
        return n[index]==target || linear(n,target,index+1);
    }
    static int linear2(int[] n ,int target,int index){
        if(index==n.length){
            return -1;
        }
        if(n[index]==target){
            return index;
        }
        return linear2(n,target,index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findindex(int[] n,int target,int index){
        if(index==n.length){
            return;
        }
        if(n[index]==target){
            list.add(index);
        }
        findindex(n,target,index+1);

    }
    static ArrayList<Integer> findallindex2(int[] n,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==n.length){
            return list;
        }
        // this will contain answer for that function call only..
        if(n[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallindex2(n,target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}

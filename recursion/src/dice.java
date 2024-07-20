import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println( dice2("",4));

    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> dice2(String p,int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(dice2(p+i,target-i));
        }
        return ans;
    }

}

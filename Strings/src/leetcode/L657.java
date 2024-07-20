package leetcode;

public class L657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("RRDD"));
    }
    public static boolean judgeCircle(String moves) {
        int count=0;
        for(int i = 0; i<moves.length();i++){
            if(moves.charAt(i)=='U' || moves.charAt(i)=='R'){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }

    }
}

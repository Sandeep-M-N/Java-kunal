public class Reach_a_Number {
    public static void main(String[] args) {
        int target=8;
        System.out.println(reachnumber(target));

    }
    static int reachnumber(int target){
        int sum=0;
        int steps=0;
        if(target==0){
            return 0;

        }
        while(sum<target){
            sum+=steps;
            steps++;
        }
        while((sum-target)%2==1){
            sum+=steps;
            steps++;
        }
        return steps-1;

    }
}

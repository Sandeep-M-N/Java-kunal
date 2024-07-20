public class Longest_sequence {
    public static void main(String[] args) {
        String s="abcccccbba";
        int start=0;
        int end= s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                break;
            }
            else{
                start++;
                end--;
            }
        }
        int ans=end-start-1;
        System.out.println(ans);
    }
}

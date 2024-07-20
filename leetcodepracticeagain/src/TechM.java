import java.util.Arrays;

public class TechM {
    public static void main(String[] args) {
        String text="black blue black white blue";
        String[] arr =text.split(" ");
        String[] ans = new String[100];
        int start=0;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i].equals(arr[j])){
                    ans[start]=arr[j];
                    start++;
                    break;

                }
                else {
                    j++;
                }
            }

        }
        System.out.println(Arrays.toString(ans));
    }
}

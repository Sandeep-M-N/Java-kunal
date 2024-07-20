import java.util.Arrays;
import java.util.HashMap;

public class Most_occurence {
    public static void main(String[] args) {
        String s="abcdabcd";
        char[] ans=s.toCharArray();
        int[] arr=new int[s.length()];

        for(int i=0;i<s.length()-1;i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)){
                    count++;
                }
                arr[i]=count;
            }

        }
        System.out.println(Arrays.toString(arr));
        int max=0;
        int maxindex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        System.out.println(max);
        System.out.println(ans[maxindex]);

    }
}

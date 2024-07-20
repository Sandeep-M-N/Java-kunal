import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String[] arr ={"catch","got","tiger","mat","eat","pat","tap","tea"};
        String word="ate";
        int start=0;
        int end= arr.length;
       char[] dword= word.toCharArray();
       Arrays.sort(dword);

        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
//            int count=0;
            if(arr[i].length()==word.length()){
//                for (int j = 0; j < word.length(); j++) {
                char[] darr=arr[i].toCharArray();
                Arrays.sort(darr);

                    if(Arrays.equals(dword,darr)){
//                        count++;
                        ans.add(arr[i]);
                    }

//                }
//                if(count==1){
//                    ans.add(arr[i]);
//                }
            }

        }
        System.out.println(ans);
    }
}

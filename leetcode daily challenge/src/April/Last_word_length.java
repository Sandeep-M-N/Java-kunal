package April;

import java.util.Arrays;

public class Last_word_length {
    public static void main(String[] args) {
        String s = "hello world";
        String[] arr= s.split(" ");
        System.out.println(Arrays.toString(arr));
        int last=arr[arr.length-1].length();
        System.out.println(last);
    }
}

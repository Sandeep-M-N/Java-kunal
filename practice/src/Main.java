import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] arr = {"3","30","34","5","9"};
        System.out.println(largestnumber(arr));

    }
    public static String largestnumber(String arr[]){

        Arrays.sort(arr,(num1, num2)->(num2+num1).compareTo(num1+num2));
        String str="";
        for(String s : arr){
            str+=s;
        }
        return str;
    }
}
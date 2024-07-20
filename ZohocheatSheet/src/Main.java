// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
        public static void main (String[] args) {
            Stack<String> result=new Stack<>();
            String res="ca";
            result.push(res);
            int count=2;
            StringBuilder temp =new StringBuilder(result.pop());
            for (int i = 1; i < count; i++) {
                temp.append(res);
            }
            System.out.println(temp);
        }
    }

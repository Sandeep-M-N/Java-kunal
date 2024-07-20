import java.util.Arrays;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        String[] s={"flower","flight","flow"};
//        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
//        String b=s.toLowerCase();
//        int start=0;
//        int end=b.length()-1;
//        int pole=0;
//        while(start<=end){
//            if(Character.isLetter(b.charAt(start)) && Character.isLetter(b.charAt(end))){
//                if(b.charAt(start)!=b.charAt(end)){
//                    pole=0;
//                    break;
//                }
//                else{
//                    pole=1;
//                    start++;
//                    end--;
//                }
//            }
//            else if(!Character.isLetter(b.charAt(start))){
//                start++;
//            }
//            else{
//                end--;
//            }
//
//        }
//        if(pole==1){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

//        String[] str = s.split("[,;:-]");
//        for(String k : str){
//            b+=k;
//
//        }
//       String c= b.toLowerCase();
//        System.out.println(b);
//
//        String[] str2=c.split(" ");
//        StringBuilder ans = new StringBuilder();
//        for(String r : str2) {
//            ans.append(r);
//        }
//        ans.reverse();
//        System.out.println(ans.toString());

        String sequence="aaabaaaabaaabaaaabaaaabaaaabaaaaba";
//        String word ="aaaba";
//       int i=0;
//       int j=0;
//       int count=0;
//       while(i<sequence.length() && j<sequence.length()){
//           if(sequence.charAt(i)==word.charAt(j)){
//               if(j==word.length()-1){
//                   j=0;
//                   count++;
//                   sequence=sequence.substring(i+1,sequence.length());
//                   i=0;
//               }
//               else{
//                   i++;
//                   j++;
//               }
//           }
//           else{
//               sequence=sequence.substring(i+1,sequence.length());
//               i=0;
//               j=0;
//           }
//       }
//        System.out.println(count);
//

        StringBuilder str = new StringBuilder(sequence);
//        sequence=str.reverse().toString();
//        System.out.println(sequence);
        System.out.println(str.toString());

    }
}
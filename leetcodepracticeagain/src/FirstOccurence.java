import java.util.Arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        String s = "zohocorporation port";
        String first = s.substring(0, 15);
        String second = s.substring(16, s.length());
        int min = 12345;
        int max = 0;
        int count = 0;
        for (int i = 0; i < second.length(); i++) {
            int temp = first.indexOf(second.charAt(i));
            if (temp < min) {
                min = temp;
            }
            if(temp>max){
                max=temp;
            }



        }
        System.out.println(min);
        System.out.println(max);
    }
}

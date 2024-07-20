import java.util.Scanner;



public class Switch_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a rugged fruit");
                break;
            case "orange":
                System.out.println("a pulpy fruit");
                break;
            default:
                System.out.println("you have entered is not a fruit ");
        }


    }
}

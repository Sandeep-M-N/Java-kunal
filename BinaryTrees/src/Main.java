import org.w3c.dom.Node;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
        tree.display();
    }
}
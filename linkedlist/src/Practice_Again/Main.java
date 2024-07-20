package Practice_Again;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(4);
        list.insertfirst(8);
        list.insertfirst(17);

        list.insertlast(23);
        list.insertlast(12);
        list.insertlast(21);
        list.insert(33,4);
        list.display();
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> list = new Stack<>();
//        list.push(35);
//        list.push(33);
//        list.push(29);
//        list.push(22);
//        list.push(18);
//
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        System.out.println(list.pop());
//        System.out.println(list.pop());


        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());




    }
}

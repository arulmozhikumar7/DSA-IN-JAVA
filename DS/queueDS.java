import java.util.Queue; // import queue
import java.util.LinkedList; // import linked list (for implementing queue using linked list as queue is a interface and linked list is a class)

public class queueDS {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>(); // create queue
        System.out.println(queue.isEmpty()); // check if queue is empty
        queue.add(1); // add element
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.peek()); // top element
        System.out.println(queue.remove()); // remove top element
        System.out.println(queue.element()); // top element
        System.out.println(queue);

        queue.offer( 10); 
        queue.poll();

        System.out.println(queue);
    }
}
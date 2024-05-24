import java.util.LinkedList; // import linked list

public class linkedlistDS {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(); // create linked list
        System.out.println(list.isEmpty()); // check if linked list is empty
        list.offer(1); // add element
        list.offer(2);
        list.offer(3);
        list.offer(4);
        list.offer(5);
        System.out.println(list);
        System.out.println(list.peek()); // top element
        System.out.println(list.remove()); // remove top element
        System.out.println(list.element()); // top element
        System.out.println(list);
        list.offer(10);
        list.poll();
        System.out.println(list);
        list.addFirst(0);
        list.addLast(6);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

}
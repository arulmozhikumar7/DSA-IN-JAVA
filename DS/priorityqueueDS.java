import java.util.PriorityQueue;

public class priorityqueueDS
{
    public static void main(String[] args) {
     
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // create priority queue
        System.out.println(pq.isEmpty()); // check if priority queue is empty
        // add element
        pq.add(4);
        pq.add(5);
        pq.add(2);
         pq.add(1);
        pq.add(3);
        
        System.out.println(pq);
        System.out.println(pq.peek()); // top element
        System.out.println(pq.remove()); // remove top element
        System.out.println(pq.element()); // top element
        System.out.println(pq);

    /*
    The order in which elements appear when 
    you print a PriorityQueue does not necessarily
    reflect the order in which they were inserted. 
    Instead, it reflects the internal structure of the binary heap 
    that the PriorityQueue uses to maintain its elements. 
    The PriorityQueue ensures that the smallest element is always at the 
    head of the queue
    */


    }
}
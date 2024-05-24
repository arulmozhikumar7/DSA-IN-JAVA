import java.util.Stack; // import stack

public class stackDS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // create stack
        System.out.println(stack.isEmpty()); // check if stack is empty
        stack.push(1); // push element
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek()); // top element
        System.out.println(stack.pop()); // remove top element
        System.out.println(stack.search(3)); // search element
        System.out.println(stack);

        // Inherited methods 
        stack.add(0, 10); // insert element at index 0
        System.out.println(stack.size()); // size of stack
        stack.clear(); // clear stack
        System.out.println(stack);  
    }
}
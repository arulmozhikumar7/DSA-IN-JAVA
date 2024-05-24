import java.util.ArrayList; // import array list

public class arraylistDS {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // create array list
        System.out.println(list.isEmpty()); // check if array list is empty  
        list.add(1); // add element
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(0)); // get element at index 0
        list.remove(0); // remove element at index 0
        System.out.println(list);
        list.add(0, 10); // insert element at index 0
        list.set(0, 11); // replace element at index 0
        System.out.println(list);

    }
}
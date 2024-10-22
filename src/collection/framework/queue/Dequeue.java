package collection.framework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Tejasvi");
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        deque.addLast("Pawan");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

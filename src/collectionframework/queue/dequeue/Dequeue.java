package collectionframework.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        deque.addLast("Pawan");
        deque.addFirst("Tejasvi");
        deque.offer("Java");
        deque.remove();
        deque.poll();
//        System.out.println(deque.peek());
//        System.out.println(deque.pop());



        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

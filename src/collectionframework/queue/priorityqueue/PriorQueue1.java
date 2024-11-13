package collectionframework.queue.priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);



        ArrayList al=new ArrayList<>(queue);
        System.out.println(al);
    }
}

package CollectionFrameWork.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue q= new LinkedList();
        q.offer(10);
        q.offer(1);
        q.offer(5);
        q.offer(7);
        q.offer(8);

        System.out.println(q);
    }
}

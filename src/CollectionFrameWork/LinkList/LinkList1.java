package CollectionFrameWork.LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(null);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
        ll.set(1,200);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);




    }
}

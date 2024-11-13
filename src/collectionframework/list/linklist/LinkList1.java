package collectionframework.list.linklist;

import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(100);
        ll.add(200);
        ll.add(300); ll.add(100);
        ll.add(200);
        ll.add(300);
        LinkedList<Integer> l1=new LinkedList<Integer>(ll);
        LinkedList<Integer> add=new LinkedList<Integer>();


//        System.out.println(ll);
//        ll.remove(1);
//        System.out.println(ll);
//        ll.set(1,200);
//        System.out.println(ll);
//        ll.removeFirst();
//        ll.removeLast();
        System.out.println(ll);
        for (int i=0;i<ll.size();i++){
            add.add(ll.get(i)+l1.get(i));
        }
        System.out.println(add);







    }
}

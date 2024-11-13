package collectionframework.list.linklist.w3resource;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorOperations {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);
        ll.add(600);
        ll.add(700);
        ll.add(800);
        ll.add(900);

        ll.addFirst(100);
        ll.addLast(1000);
        ll.set(4,5000);
        System.out.println("Using ForEach");
        for (Object l:ll) {
            System.out.println(l);
        }
        System.out.println("Using Iterator");
//        Stop elements in particular elment
        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            Object element=itr.next();
            if(element.equals(5000)){
                break;
            }
            System.out.println(element);
        }

//   using Iterator in Reverse order
        System.out.println("Reverse order");
        Iterator it1=ll.descendingIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }




        System.out.println(ll);
    }
}

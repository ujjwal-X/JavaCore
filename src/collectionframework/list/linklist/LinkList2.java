package collectionframework.list.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList2 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Java");
        ll.add(".Java");
        ll.add(".Class");
        ll.add("Compiled");
        ll.add("Developer");
        System.out.println(ll);

//        while (itr.hasNext()){
//            System.out.print (itr.next()+"-> ");
//        }
        ll.remove(3);
        Iterator itr=ll.iterator();
        while (itr.hasNext()){
            System.out.print (itr.next()+"-> ");
        }


    }
}

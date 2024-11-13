package collectionframework.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        for(int i=0; i<=20; i++){
            al.add(i);
        }
        Iterator itr= al.iterator();
        System.out.println(itr.getClass().getName());
        while (itr.hasNext()){
          Integer i=(Integer) itr.next();
          if(i%2==0){
              System.out.println(i);
          }
          else {
              itr.remove();//we can use remove operations in iterable iterface which is not allowed in enumeraton interface in cursor
          }
        }

    }
}

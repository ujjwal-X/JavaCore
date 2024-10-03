package CollectionFrameWork.LinkList;

import java.util.LinkedList;
import java.util.Scanner;

public class RemovingLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(100);
        ll.add(5);
        ll.add(10);
        ll.add(20);
        ll.add(12);
        ll.add(52);
        ll.add(23);
        ll.add(13);
        ll.add(9);
        ll.add(90);
        System.out.println(ll);
        for (int i=0;i<ll.size();i++){
            if(ll.get(i)>25){
                ll.remove(i);//it will remove all digits bigger than 25
            }
        }
        System.out.println(ll);


    }
}

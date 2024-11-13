package collectionframework.list.linklist;

import java.util.LinkedList;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
public class SearchLinkList {
    public static void main(String[] args) {

        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.add(8);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        for (int i=0; i<ll.size();i++){
            if(ll.get(i)==3){
                System.out.println(i);
                break;
            }
        }





    }
}

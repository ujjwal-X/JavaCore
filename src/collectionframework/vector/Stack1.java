package collectionframework.vector;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack s=new Stack();
        //to add element in stack we use push
        s.push(11);
        s.push(15);
        s.push(2);
        s.push(56);
        s.push(10);
        System.out.println(s);
        //to remove element from an stack we use pop
        s.pop();

        //searching the element present stack
        System.out.println(s.search(2));


        System.out.println(s);




    }
}

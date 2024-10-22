package collection.framework.list.arraylist.w3resource;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        al.add(700);
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        al.set(1,x);
        System.out.println(al);
    }
}

package collection.framework.list.arraylist.w3resource;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapsTwoElements {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(1000);
        al.add(600);

        ArrayList al1=new ArrayList<>();
        al1.add(1000);
        al1.add(2000);
        al1.add(3000);
        al1.add(4000);
        al1.add(5000);
        al1.add(6000);
        Scanner sc=new Scanner(System.in);
        System.out.println("List 1"+al);
        System.out.println("List 2"+al1);
        System.out.println("print values you want to exchange not index");
        int value=sc.nextInt();//200
        int value1=sc.nextInt();//2000

        al.set(al.indexOf(value),value1);//1,200
        al1.set(al.indexOf(value1),value);
        System.out.println(al);
        System.out.println(al1);

    }
}

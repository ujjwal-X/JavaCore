package CollectionFrameWork.ArrayList;

import OOPS.ObjectClass.Interface.A;
import OOPS.ObjectClass.Object;

import java.util.*;

public class AddAllMethod{
    public static void main(String[] args) {

        String[] formatted = new String[]{"Ujjawal Kumar Shrivastave", "Conference Kumar Value", "Bottle Kumar Cap"};

        System.out.println("Ujjawal Kumar - Shrivastava");


        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("JAVA");
        listOfNames.add("GOAL");
        listOfNames.add("Learning");
        listOfNames.add("GOAL");
        System.out.println(listOfNames);

        String[] s = listOfNames.toArray(new String[0]);
           for(String se : s){
               System.out.print(se + ", ");
           }
        System.out.println();
        List<String> list = Arrays.asList(s);
        System.out.println(list);

//        ArrayList<Integer> al=new ArrayList<>();
//        al.add(100);
//        al.add(100);
//        al.add(100);
//        al.add(100);
//        ArrayList<Integer> al1=new ArrayList<>();
//        al1.add(200);
//        al1.add(200);
//        al1.add(200);
//        al1.add(200);
//        //add all method
//        al1.addAll(1,al);//in the middle of index
//        ArrayList<Integer> copy= new ArrayList<>();
//        ArrayList objMethod=(ArrayList) al1.clone();
//        al1.set(1,90);//Change in original object
//        objMethod.set(2,100000);//change in cloned method
//        objMethod.set(7,800000);//change in cloned method
//        System.out.println("Original"+al1);
//        System.out.println("Clone"+objMethod);
//        System.out.println("Original"+al1);
//
//        System.out.println("=====================================");
//        System.out.println("Contains method");
//        System.out.println( al.contains(100));
//
//        System.out.println("=====================================");
//        System.out.println("Arraylist to Array");
//        Object[] objects = al1.toArray();
//
//        for (Object i:objects) {
//            System.out.println(i);
//        }
////        System.out.println("=====================================");
////        System.out.println(" Remove elements from Array list ");
////        System.out.println(listOfNames);
////        listOfNames.remove("GOAL");
////        listOfNames.remove(2);//removed using index
//////        listOfNames.removeAll(listOfNames);

//        System.out.println(listOfNames);

//iterator
//        System.out.println("=====================================");
//        System.out.println("Iterator");
//        System.out.println("Original" +listOfNames);
//        Iterator<String> itr=listOfNames.iterator();
//        while (itr.hasNext()){
//            String str= (String) itr.next();
//            if(str.equals("GOAL")){
//             itr.remove();
//            }
//        }
//        System.out.println("Removed"+listOfNames);
        ArrayList<Integer> al= new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

//        System.out.println("=====================================");
//        System.out.println("Sub List");
//        System.out.println(listOfNames);
//        System.out.println(listOfNames.subList(1,4));
//        Integer[] arr= (Integer[]) al.toArray();
//        for (Integer i:arr){
//            System.out.println(i);
//        }

//        String[] namesArray = new String[]{listOfNames.toArray().toString()};
//
//            for (String s:namesArray){
//                System.out.println("msg");
//                System.out.println(s);
//            }












    }





}

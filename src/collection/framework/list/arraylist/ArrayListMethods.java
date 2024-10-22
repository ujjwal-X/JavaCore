package collection.framework.list.arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(2000);



// 1=>  ensureCapacity() method is used to increase the current capacity of an ArrayList. However, capacity of an ArrayList
//        is automatically increased when we try to add more elements than the current capacity. To manually increase the current
//        capacity, ensureCapacity() method is used.
//        al.ensureCapacity(100);
// 2=>  trimToSize() method is used to trim the capacity of arrayList to the current size of ArrayList. Developers use this
//        method to minimize the storage area of an ArrayList.
        al.trimToSize();// //reducing the current capacity to current size of an ArrayList.

// 3=> al.size() => Using size() method. size() method returns number of elements present in an ArrayList.
//        System.out.println("size "+al.size());
// 4=> isEmpty() method of ArrayList is used to check whether the given ArrayList is empty or not. This method returns true if an ArrayList contains no elements otherwise returns false.
//        System.out.println("isEmpty()"+al.isEmpty());

// 5=>Using contains() method of ArrayList, we can examine whether the ArrayList contains the given element or not. This method returns true if ArrayList has that element otherwise returns false.
//        System.out.println(al.contains("Contains"+100));

// 6=> We can use indexOf() and lastIndexOf() methods to find out the position of a given element in an ArrayList. indexOf()
// method returns index of first occurrence of a specified element where as lastIndexOf() method returns index of last
// occurrence of a specified element in an ArrayList. If element is not found, they will return -1.
//        System.out.println("index of "+al.indexOf(100));
// 7=> Using toArray() method of ArrayList class. toArray() method returns an array containing all elements of the ArrayList.
// This method acts as a bridge between normal arrays and collection framework in java.
//        Object[] obj=al.toArray();//using object
//        for (Object o:obj) {
//            System.out.println(o);
//        }
//
//        Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            Integer i= (Integer) itr.next();
//            if(i==200 || i==300){
//                itr.remove();
//            }
//            System.out.println(i);
//            itr.next();
//        }

//8=>set() method replaces a particular element in an Arraylist with the given element. This method takes two arguments. One is the index of the element to be replaced and another one is the element to be placed at that position.
        al.set(2,"Java");
        System.out.println(al);
//9 => We can use addAll() method which takes Collection type as an argument to join two ArrayLists. This method appends
// all elements of the passed collection to the end of the invoking collection.
//10 =>Another version of addAll() method which takes two arguments, one is index and another one is Collection type, can
// be used for this requirement. This method inserts all of the elements of passed collection at a specified position of an
// ArrayList.


//        ArrayList<String> listOfNames = new ArrayList<String>();
//        listOfNames.add("JAVA");
//        listOfNames.add("GOAL");
//        listOfNames.add("Learning");
//        listOfNames.add("GOAL");
//        System.out.println(listOfNames);

//        String[] s = listOfNames.toArray(new String[0]);
//           for(String se : s){
//               System.out.print(se + ", ");
//           }
//        System.out.println();
//        List<String> list = Arrays.asList(s);
//        System.out.println(list);

//        ArrayList<Integer> al=new ArrayList<>();
//        al.add(100);
//        al.add(100);
//        al.add(100);
//        al.add(100);
//        ArrayList<Integer> al1=new ArrayList<>();
//        al1.add(200);
//        al1.add(300);
//        al1.add(400);
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
//        System.out.println(al1);
//        System.out.println("Arraylist to Array");
//        Object[] objects = al1.toArray();

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
//        ArrayList<Integer> al= new ArrayList<>();
//        al.add(100);
//        al.add(200);
//        al.add(300);
//        al.add(400);

//        System.out.println("=====================================");
//        System.out.println("Sub List");
//        System.out.println(listOfNames);
//        System.out.println(listOfNames.subList(1,4));
//        Integer[] arr= (Integer[]) al.toArray();
//        for (Integer i:arr){
//            System.out.println(i);
//        }

//        String[] namesArray = new String[]{Arrays.toString(listOfNames.toArray())};
//
//            for (String s:namesArray){
//                System.out.println("msg");
//                System.out.println(s);
//            }












    }





}

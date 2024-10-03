package StringPractice.StringBuffer;
//String buffer class extends abstract String buffer and abstract String Buffer class import String files methods
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Java Devloper");
        sb.append(3.14);//for float
        sb.append(true);//for boolean
        sb.append('J');//for character
//        System.out.println(sb);
        //this is method overloading
//        System.out.println("Length"+sb.length());
//        System.out.println("Capacity of String"+sb.capacity());
//        System.out.println("CharAt"+sb.charAt(2));
//        System.out.println("replacing the values using char at");
        sb.setCharAt(+3,'Z');
//        System.out.println(sb);
        StringBuffer str=new StringBuffer(100);
//        System.out.println("Capacity of str "+str.capacity());
//        sb.charAt(100); StringIndexOutOfBoundException

//        System.out.println("insert method");//used to insert anything in middle of string
//        System.out.println(sb);
//        sb.insert(2,"XYZ");//you can put anything in here int string char boolean
//        System.out.println(sb);
//
//        System.out.println("delete methods usefully for deleting group of characters ");//it deletes character from begins index to n-1 index
//        sb.delete(2,20);//doesnt give error if index exceed index limit
//        System.out.println(sb);
//
//
//        System.out.println("delete methods for single index");
//        sb.deleteCharAt(3);
//        System.out.println(sb);
//
//        System.out.println("Reverse Method");
//        sb.reverse();
//        System.out.println(sb);
//
//
//        System.out.println("setLength Method");//cuts the whole string and prints the size you given to string size works as index
//        sb.setLength(5);//(n-1)=4
//        System.out.println(sb);

//        System.out.println("==================================");
//        System.out.println("ensureCapacity Method");
          StringBuffer str1= new StringBuffer();
          str1.ensureCapacity(1000);//to increase capacity based on our requirement on fly
//        System.out.println(str1.capacity());
        System.out.println("==================================");
        System.out.println("trimToSize Method");//suppose if we take 100 memory capacity and filled only 10 space then remaining space will be deleted by trimToString()
        str1.trimToSize();
        System.out.println(str1.capacity());



    }
}

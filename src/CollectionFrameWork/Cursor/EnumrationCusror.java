package CollectionFrameWork.Cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumrationCusror {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.addElement(1);
        v.add(100);
        v.add(2000);
        v.add(230);
        v.add(450);


        Enumeration e=v.elements();
        System.out.println(e.getClass().getName());
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

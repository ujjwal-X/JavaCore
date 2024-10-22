package array;

import java.util.Arrays;

class A{

}

public class CopyingArray {
    public static void main(String[] args) {
//        Object[] a=new Object[5];
//        for (int i=0; i<a.length;i++){
//            a[i]=new A();
//        }
//        System.out.println(a[0].equals(a[1]));
        int[] a=new int[]{1,2,3,4,5};
        int[]b=a;
        int[] c=new int[]{1,2,3,4,5};
        int[] d= Arrays.copyOf(c,10);
        int[] x=new int[10];
        System.arraycopy(a,0,x,0,a.length);
        for (int z:d) {
            System.out.println(a);

        }


    }
}

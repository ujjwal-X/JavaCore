package gfgsdesheet;

import java.util.ArrayList;

/*
  3 3 3 2 2 2 1 1 1
  3 3 2 2 1 1
  3 2 1
*
 */
public class NumberPattern {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> list=new ArrayList<Integer>();
//        for(int z=0;z<n;z++){
//            for (int i = 3; i >= 1; i--) {
//                for (int j = 1; j <= 3-z; j++) {
//                    list.add(i);
//                }
//            }
//        }
        for (int j = n; j >= 1; j--) {      // Print numbers from 3 down to 1
            for (int k = 0; k < n; k++) { // Repeat each number (n - i) times
                System.out.println(j);
            }
        }

        System.out.println(list);
    }
}

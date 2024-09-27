package CollectionFrameWork.Cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        for(int i=0; i<=20; i++){
            al.add(i);
        }
        Iterator itr=(Iterator) al.iterator();

    }
}

package CollectionFrameWork.Set;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();

        h.add("B");
        h.add("C");
        h.add("C");

        h.add(null);

        h.add("Z");
        h.add("X");
        h.add(null);
        h.add("Y");
        LinkedHashSet<String> lh=new LinkedHashSet<String>(h);
        lh.add("M");
        lh.add(null);
        lh.add(null);
        System.out.println(h.add("C"));
        System.out.println("hashSet "+h);
        System.out.println("LinkedHashSet "+lh);

    }
}

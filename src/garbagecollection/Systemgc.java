package garbagecollection;

public class Systemgc {
    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        Systemgc s=null;
        r.freeMemory();
        System.out.println(s);
        System.out.println( r.availableProcessors());
        System.out.println( r.totalMemory());
        System.out.println(s);
        System.out.println( r.totalMemory());
        System.out.println( r.maxMemory());
    }
}

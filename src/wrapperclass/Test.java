package wrapperclass;
public class Test {
    int x = 19;
    static void increment(int x){
       x=100;

    }
    static void increment(Integer x){
//        System.out.println( x );
        x = 29;
    }
    static void increment(Test t){
        t.x = 100;
    }

    public static void main(String[] args) {
        int x=10;
        Integer  i = 2000;
        System.out.println(i);

        Test t = new Test();
        System.out.println("Test object Original value" + t.x);
        increment(t);
        System.out.println("Test object Changed value"+t.x);
        increment(x);

        System.out.println("Original value of autoBoxing" + i);
        increment(i);

        System.out.println("Changed value of autoBoxing"+i);
        System.out.println(x);
        System.out.println(i);

    }

}

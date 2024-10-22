package exceptionalhandling;

public class ExThrows {
    public static void main(String[] args) {
//we can also pass throws exception to our main function, and it goes to JVM which is not a good Practice its better to handle Exceptional Handling inside main function
        try{
            a();
        }
        catch (Exception c){
            System.out.println("Something Went Wrong"+c.getMessage());
        }
    }
    static void a() throws Exception{
        b();
    }
    static void  b() throws Exception{
        int x=6;
        int y=0;
        System.out.println(x/y);
    }
}

package exceptionalhandling;
//this is Default Exceptional handling  provided by jvm when there is no code written in methods to handle the exception
//then it will go to main method and after that goes to jvm and jvm provide default exceptional handler to handle exception
//default exception just throw the exception information to the console and terminate abnormally
public class DefaultException1 {

    public static void main(String[] args){
        doStuff();

    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println(100/0);
    }
    public static void doMoreStuff(){
        System.out.println("hello");//doesn't matter if one method is running correctly and other method is calling throws
        // exception it will consider as abnormal termination
    }

}



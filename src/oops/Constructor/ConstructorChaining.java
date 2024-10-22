package oops.Constructor;
//Why do we need constructor chaining?
//
//This process is used when we want to perform multiple tasks in a single constructor rather than creating a code for each task in a single
//constructor we create a separate constructor for each task and make their chain which makes the program more readable.
public class ConstructorChaining {
    ConstructorChaining(){

        this(10);

        System.out.println("First Constructor");
        return;
    }
    ConstructorChaining(int x){
        this(10,20);
        System.out.println("Second Constructor");
    }
    ConstructorChaining(int x,int y){
        System.out.println(x*y);
        System.out.println("Third Constructor");
    }
    public static void main(String[] args) {
        new ConstructorChaining();;
    }
}

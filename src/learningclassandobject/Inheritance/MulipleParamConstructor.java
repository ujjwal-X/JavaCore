package learningclassandobject.Inheritance;
class Father{
    Father(){
        System.out.println("i am parent constructor");
    }
    Father(int x){
        System.out.println("i am params constructor of values"+x);
    }
}
class Children extends Father{
    Children(){
        System.out.println("i am Child constructor");
    }
    Children(int x,int y,int z){
        super(x);
        System.out.println("i am Child constructor"+x+y);
    }

}

public class MulipleParamConstructor {
    public static void main(String[] args) {
        Children c=new Children(10,20,30);

    }
}

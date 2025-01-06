package learningclassandobject.polymorphism.overloading;



public class ExcpetionCase {
    int a,b;
//    void  add(int a,int b){
//        System.out.println("nomral method run");
//    }
//    void add(Integer a,int b){
//        System.out.println("Integer method run");
//    }
    void add(int b, int... a){
        System.out.println("Var Args method run");
    }

    public static void main(String[] args) {
        ExcpetionCase e=new ExcpetionCase();
        e.add(10,10,20,20,202,0,2);
    }
}

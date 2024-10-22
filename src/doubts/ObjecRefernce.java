package doubts;
class Store{
    ObjecRefernce obj;
    Store(ObjecRefernce obj){
        this.obj=obj;
    }
}

public class ObjecRefernce {
    int x=10;
    int y=20;
    public static void main(String[] args) {
        ObjecRefernce obj=new ObjecRefernce();
        Store s=new Store(obj);

        System.out.println(s.obj.x);
        s.obj.x=1000;
        System.out.println(obj.x);
        System.out.println(s.obj.x);





    }
}

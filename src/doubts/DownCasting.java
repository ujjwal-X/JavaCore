package doubts;
class Pen{
void greet(){
    System.out.println("Hii i am pen");
}
}
class SketchPen extends Pen{
    void greet(){
        System.out.println("Hii i am SketchPen");
    }
}
class MarkerPen extends Pen{
    void greet(){
        System.out.println("Hii i am MarkerPen");
    }

}

public class DownCasting {
    public static void main(String[] args) {
        SketchPen sp1=new SketchPen();
        SketchPen sp2=sp1;

        Pen p=sp1;//Up- Casting
        p.greet();
        Object o=sp1;//Up- Casting
        System.out.println("===================Down Casting Starts from here=====================");


        Pen p1=new SketchPen();
//        MarkerPen mp2=(MarkerPen) p1;
//        mp2.greet();
//        MarkerPen mp3=(MarkerPen) p1;
//        mp3.greet();
        SketchPen sp3 = (SketchPen) p1; // This cast is valid
        sp3.greet();
    }
}

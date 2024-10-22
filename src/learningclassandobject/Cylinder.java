package learningclassandobject;

class CylinderClass{
    int radius;
    double height;

    double curvedSurfaceArea(){
        return  2*Math.PI*radius*height;
    }
    double totalSurfaceArea(){
        return 2*Math.PI*radius*radius+radius*height;
    }
    double Volume(){
                return Math.PI*radius*2*height;
    }

}
public class Cylinder {
    public static void main(String[] args) {
        CylinderClass c1=new CylinderClass();
        c1.height=12;
        c1.radius=2;
        System.out.println(c1.totalSurfaceArea());
        System.out.println(c1.Volume());
        System.out.println(c1.curvedSurfaceArea());

    }
}

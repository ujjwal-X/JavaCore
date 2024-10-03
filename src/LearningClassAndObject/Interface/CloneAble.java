package LearningClassAndObject.Interface;

/*
 * The process of creating exactly duplicate object is called Cloning process
 * */
public class CloneAble implements Cloneable {

    private String name;

    public void setNAme(String name) {
        this.name = name;
    }

    public String getNAme() {
        return this.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Call the clone method from Object
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneAble c = new CloneAble();
        c.setNAme("mayank");
        CloneAble c1 = (CloneAble) c.clone(); // Use Object.clone() via overridden method
        System.out.println("c1 " + c1.getNAme());
        System.out.println("c " + c.getNAme());

        c.setNAme("Tomar");
        System.out.println("c1 " + c1.getNAme());
        System.out.println("c " + c.getNAme());
    }
}

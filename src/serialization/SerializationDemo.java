package serialization;

import java.io.*;

class Dog implements  Serializable{
    int i=10;
    int j=100;
}

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d=new Dog();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);

        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog) ois.readObject();
        System.out.println(d2.i+" "+d2.j);

    }
}

package iopackage;

import java.io.*;

public class ExternalizableDemo implements Externalizable {
    String s;
    int i;
    int j;
    public ExternalizableDemo(){
        System.out.println("No args Constructor");
    }

    public ExternalizableDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s= (String) in.readObject();
        i=in.readInt();
    }

    public static void main(String[] args)throws Exception {
        ExternalizableDemo e1=new ExternalizableDemo("Java",10,20);
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e1);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ExternalizableDemo e2=(ExternalizableDemo) ois.readObject();
        System.out.println(e2.i+" "+e2.j+" "+e2.s);
    }
}

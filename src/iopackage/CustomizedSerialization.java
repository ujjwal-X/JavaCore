package iopackage;


import oops.Modifiers.Package1.A;

import java.io.*;

class Account implements Serializable{
    String username="Java";
    transient  String password="#123@";

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();//this method meant for default serialization
        String epwd="123"+password;
        os.writeObject(epwd);

    }
    private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();//meant for default de serialization
        String epwd=(String)ois.readObject();
        password=epwd.substring(3);
    }
}

public class CustomizedSerialization {
    public static void main(String[] args) throws Exception{
        Account a1=new Account();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account) ois.readObject();
        System.out.println(a2.username+" "+a2.password);

    }
}

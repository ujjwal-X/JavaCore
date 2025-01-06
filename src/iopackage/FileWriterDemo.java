package iopackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
//        overiding
//        FileWriter fw=new FileWriter("abc.txt");
//        fw.write(100);
//        fw.write("Java Devloper");
//        fw.write('\n');
//        char[] ch={'a','b','c'};
//        fw.write(ch);
//        fw.write('\n');
//        fw.flush();
//        fw.close();

//        i set append to true now every time i run program it will print again and again
        FileWriter fw=new FileWriter("abc.txt",true);
        fw.write(100);
        fw.write("Java Devloper");
        fw.write('\n');
        char[] ch={'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}

package iopackage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("abc.txt");
        pw.write(100);
        pw.print(true);
        pw.println(100);
        pw.println('c');
        pw.println("Durga");
        pw.flush();
        pw.close();

    }
}

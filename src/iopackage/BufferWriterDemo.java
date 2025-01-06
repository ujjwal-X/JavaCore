package iopackage;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("abc.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] c=new char[]{'a','b','c','d'};
        bw.write(c);
        bw.newLine();
        bw.write("Java");
        bw.newLine();
        bw.write("Developer");
        bw.flush();
        bw.close();
        fw.close();



    }
}

package iopackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File f=new File("abc.txt");
        FileReader fr=new FileReader("abc.txt");
//        int x=fr.read();
//
//        while (x!=-1){
//            System.out.print((char) x);
//            x=fr.read();
//        }

        char[] ch=new char[(int) f.length()];
        fr.read(ch);
        for(char c1:ch){
            System.out.print(c1);
        }

        fr.close();



    }
}

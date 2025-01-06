package iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fs=new FileInputStream("abc.txt");
        int c;
        while((c=fs.read())!=-1){
            System.out.print((char) c);
        }
    }
}

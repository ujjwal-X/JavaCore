package iopackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
        String str=br.readLine();
        while ((str=br.readLine())!=null){
            System.out.println(str);

        }
        br.close();



    }
}

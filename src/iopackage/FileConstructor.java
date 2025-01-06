package iopackage;

import java.io.File;
import java.io.IOException;

public class FileConstructor {
    public static void main(String[] args) throws IOException {
        //code to create a file name with demo.txt in Current working directory

        File f=new File("durga123");
        f.mkdir();


        // code to create a file in some other directory name durga and then file name demo.txt
        // second constructor
        File f1=new File("durga123","abc123.txt");
        f1.createNewFile();


        //third constructor
        File f2=new File(f,"demo.txt");
        f2.createNewFile();

    }
}

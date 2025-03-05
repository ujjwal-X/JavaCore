package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteData {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("file3.txt");
        BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
        String s1=br.readLine();
        while (s1!=null){
                boolean available=false;
                BufferedReader b2=new BufferedReader(new FileReader("delete.txt"));
                String s2=b2.readLine();
                while (s2!=null){
                    if(s1.equalsIgnoreCase(s2)){
                        available=true;
                        break;

                    }
                    s2=b2.readLine();
                }
                if(!available){
                    pw.println(s1);
                }
                s1=br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();

    }
}

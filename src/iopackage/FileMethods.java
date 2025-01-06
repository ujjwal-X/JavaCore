package iopackage;

import java.io.File;
import java.io.IOException;


public class FileMethods {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");//this line won't create any file It's just for checking that this file exist in this directory or not
//        System.out.println(file.exists());
        file.createNewFile();

//        System.out.println(file.exists());

        //creating directory

        File f1=new File("Durga123");
//        System.out.println(f1.exists());
        f1.mkdir();             //make directory
//        System.out.println(f1.exists());



        //to display all file present in directory


        File totalfile = new File("C:\\Users\\ujjwa\\Downloads");
        String[] s=totalfile.list();

        //This will give both directory as well as file
//        for (String string:s){
//            System.out.println(string);
//        }

        //now i want only file
  for (String files:s){
      File onlyFiles=new File(totalfile,files);
      if(onlyFiles.isFile()){
          System.out.println(files);
      }
  }


    }

}

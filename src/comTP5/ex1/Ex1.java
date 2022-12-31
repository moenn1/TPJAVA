package comTP5.ex1;

import java.io.*;

public class Ex1 {

    //Question 1
    public static void txtToBin(String Filename) throws Exception{
        int line;
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(Filename));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("output.bin"));
        while((line = br.read())!= -1){
            bw.write((char)line);
        }
        br.close();
        bw.close();
    }

    //Question 2
    public static void lireBinaire(String Filename) throws Exception{
        int line;
        File input = new File(Filename);
        InputStream inputStream = new FileInputStream(input);
        while((line = inputStream.read())!=-1){
            System.out.print((char)line);
        }
    }



    public static void main(String []args) throws Exception{
        lireBinaire("test.bin");
    }


}

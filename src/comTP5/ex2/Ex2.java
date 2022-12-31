package comTP5.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex2 {
    public static void storeObject(String Filename, Object obj) throws Exception{
        FileOutputStream f = new FileOutputStream(Filename, true);
        ObjectOutputStream os = new ObjectOutputStream(f);
        os.writeObject(obj);
        os.close();
    }

    public static void lireObject(String Filename) throws Exception{
        FileInputStream f = new FileInputStream(Filename);
        ObjectInputStream os = new ObjectInputStream(f);
        Object obj = os.readObject();
        System.out.print(obj);
        os.close();
    }

    //Read all objects
    public static void lireAllObjects(String Filename) throws Exception{
        FileInputStream f = new FileInputStream (Filename);
        ObjectInputStream os = new ObjectInputStream(f);
        Object obj;
        while((obj = os.readObject()) != null){
            System.out.print(obj);
        }
        os.close();
    }

    public static void lireAllObjects(String Filename, String name) throws Exception{
        FileInputStream f = new FileInputStream (Filename);
        ObjectInputStream os = new ObjectInputStream(f);
        Object obj;
        while((obj = os.readObject()) != null){
            if(obj.toString().startsWith(name)){
                System.out.print(obj);
            }
        }
        os.close();
    }


    public static void main(String []args) throws Exception{
        String filename = "obj.bin";
        Personne p = new Personne();
        //storeObject(filename, p);
        lireAllObjects(filename);
    }
}


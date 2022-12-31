package comTP6.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Ex1 {
    public static void printListe(ArrayList<Integer> array){
        for(Integer i: array){
            System.out.print(i + " -> ");
        }
        System.out.println("NULL");
    }



    public static void main(String[] args) {
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(12);
        list.add(1, new Integer(233));
        list.add(2, new Integer(2));
        list.add(3, new Integer(34));
        list.add(1, new Integer(-2));
        printListe(list);
        list.remove(2);
        printListe(list);*/
        /*Vector<Integer> v =  new Vector<Integer>();
        v.add(212);
        v.add(3);
        v.add(15);
        System.out.println(v);*/

    }
}

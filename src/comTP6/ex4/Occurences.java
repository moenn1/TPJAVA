package comTP6.ex4;
import sun.reflect.generics.tree.Tree;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;
public class Occurences {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("SAISIR UN TEXTE: ");
        String s = scan.nextLine();
        String[] mots = s.split("\\s+");
        for(String i: mots) {
            if (!ht.containsKey(i))
                ht.put(i, 1);
            else {
                int count = ht.get(i);
                ht.replace(i, count+1);
            }
        }

        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.putAll(ht);
        System.out.println("Tri selon le clé");
        System.out.println(tm);


        TreeSet<Map.Entry<String, Integer>> ts = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int d = o1.getValue() - o2.getValue();
                if(d==0)
                    return o1.getKey().compareTo(o2.getKey());
                return d;
            }
        });
        ts.addAll(ht.entrySet());
        System.out.println(ts);
    }
}

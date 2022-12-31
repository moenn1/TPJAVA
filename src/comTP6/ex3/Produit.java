package comTP6.ex3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Produit implements Comparable<Produit>{
    String designation;
    int prix;

    public Produit(String s, int p){
        designation = s;
        prix = p;
    }
    @Override
    public int compareTo(Produit o) {
        int d = (int) (prix - o.prix);
        if(d==0) return designation.compareTo(o.designation);
        return d;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }
    public static void main(String[] args) {
        SortedSet<Produit> set = new TreeSet<Produit>();
        set.add(new Produit("P1", 50));
        set.add(new Produit("S1", 2000));
        set.add(new Produit("PS ", 10));
        set.add(new Produit("P9", 50));
        set.add(new Produit("Lait", 5000));
        System.out.println("Trie selon le prix:");
        System.out.println(set);

        SortedSet<Produit> set2 = new TreeSet<Produit>(new Comparator<Produit>(){
            @Override
            public int compare(Produit o1, Produit o2) {
                return o1.designation.compareTo(o2.designation);
            }
        });

        set2.addAll(set);
        System.out.println("-----------------------------");
        System.out.println("Trie selon le nom:");
        System.out.println(set2.toString());
    }



}

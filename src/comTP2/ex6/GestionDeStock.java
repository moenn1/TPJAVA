package comTP2.ex6;

import java.util.*;

public class GestionDeStock {
    LinkedList<Produit> list = new LinkedList<Produit>();

    void ajouter(Produit p){
        list.add(p);
    }

    void lister(){
        for (Produit produit : list) {
            System.out.println(produit.toString());
        }
    }

    public static void main(String args[]){
        Materiel m1 = new Materiel("fork", 123242.2f, 12);
        Materiel m2 = new Materiel("shoes", 1242.2f, 8);
        Materiel m3 = new Materiel("tshirt", 3242.2f, 1);
        Logiciel l1 = new Logiciel("windows", 322.2f, 77, "microsoft", 1999);
        Logiciel l2 = new Logiciel("MACOS", 324221.2f, 1, "apple", 2002);
        GestionDeStock g = new GestionDeStock();
        g.ajouter(m1);
        g.ajouter(m2);
        g.ajouter(m3);
        g.ajouter(l1);
        g.ajouter(l2);
        g.lister();
    }

}

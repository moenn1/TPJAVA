package comTP2.ex6;

import java.util.zip.DeflaterInputStream;

public class Materiel implements Produit{
    String designation;
    float prixUnitaire;
    float quantite;
    static final char nature = 'M';

    public Materiel(String Designation, float PrixUnitaire,float Quantite){
        designation = Designation;
        prixUnitaire = PrixUnitaire;
        quantite = Quantite;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    @Override
    public float getQuantite() {
        return quantite;
    }

    @Override
    public char getNature() {
        return nature;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "designation='" + designation + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", quantite=" + quantite +
                '}';
    }
}

package comTP2.ex6;

public class Logiciel implements Produit{
    String designation;
    float prixUnitaire;
    float quantite;

    String editeur;

    int anneeEdition;
    static final char nature = 'L';

    public Logiciel(String Designation, float PrixUnitaire,float Quantite, String Editeur, int annee){
        designation = Designation;
        prixUnitaire = PrixUnitaire;
        quantite = Quantite;
        editeur = Editeur;
        anneeEdition = annee;
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
        return "Logiciel{" +
                "designation='" + designation + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                ", quantite=" + quantite +
                ", editeur='" + editeur + '\'' +
                ", anneeEdition=" + anneeEdition +
                '}';
    }
}

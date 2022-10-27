package comTP2.ex4;
//import com.ex5.*;

import java.util.ArrayList;
import comTP2.ex5.*;
public class Personne {
    //Compte [] comptes;
    ArrayList<Compte> comptes = new ArrayList<Compte>();
    protected String nom;
    protected int enfant;
    public Personne(String Nom, int Enfant, int nCompte, float Solde){
        nom = Nom;
        enfant = Enfant;
        comptes.add(new Compte(nCompte, Solde));
    }

    public void ajouterCompte(int nCompte, float Solde){
        comptes.add(new Compte(nCompte, Solde));
    }
    public String getNom(){
        return nom;
    }

    public int getEnfant(){
        return enfant;
    }
}

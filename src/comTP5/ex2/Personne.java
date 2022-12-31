package comTP5.ex2;

import java.io.Serializable;

public class Personne implements Serializable {
    int age;
    String nom;
    String prenom;

    public Personne() {
        age = 20;
        prenom = "Mohamed";
        nom = "En-Nassibi";
    }

    //to string
    public String toString(){
        return "Nom: "+nom+" Prenom: "+prenom+" Age: "+age;
    }
}

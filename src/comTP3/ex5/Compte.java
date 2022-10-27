package comTP3.ex5;



public class Compte {
    String nom;
    String prenom;
    int solde;
    String motDePasse;
    public Compte(String unNom, String unPrenom, int s, String unMot){
        nom = unNom;
        prenom = unPrenom;
        solde = s;
        motDePasse = unMot;
        System.out.println("Compte crée!");
    }

    public void depot(int somme){
        solde += somme;
        System.out.println(somme + " ajouté au compte, nouveau solde: "+ solde);
    }

    public void retrait(int somme, String unMot) throws RetraitInterdit, CodeIncorrect {
        if(unMot == motDePasse){
            if(solde >= somme){
                solde -= somme;
                System.out.println("Retrait avec succes, nouveau solde: "+ solde);
            }else throw new RetraitInterdit();
        }else throw new CodeIncorrect();
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", solde=" + solde +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}



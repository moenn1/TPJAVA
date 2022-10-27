package comTP3.ex5;

public class CompteAvecDecouvert extends Compte{
    int decouvertAutorise;
    public CompteAvecDecouvert(String unNom, String unPrenom, int s, String unMot, int decouvert) {
        super(unNom, unPrenom, s, unMot);
        decouvertAutorise = decouvert;
    }

    @Override
    public void retrait(int somme, String unMot) throws CodeIncorrect, RetraitInterdit{
        if(motDePasse==unMot){
            if(somme <= solde + decouvertAutorise){
                solde -= somme;
                System.out.println(somme + " retiré avec succes, nouveau solde: "+ solde);
            }else throw new RetraitInterdit();
        }else throw new CodeIncorrect();
    }

    @Override
    public String toString() {
        return "CompteAvecDecouvert{" +
                "decouvertAutorise=" + decouvertAutorise +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", solde=" + solde +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}




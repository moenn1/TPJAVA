package comTP2.ex4;

public class Salarie extends Personne {

    private float salaire;
    public Salarie(String Nom, int Enfant, int nC, float solde ,float Salaire) {
        super(Nom, Enfant, nC, solde);
        salaire = Salaire;
    }
    public String getInf(){
        return "Nom : "+ nom + " Nombre d'enfants: "+ enfant + " Salaire: "+ salaire;
    }
    public float getSalaire(){
        return salaire;
    }
    public float getPrime(){
        return (5*salaire*enfant)/100;
    }
}

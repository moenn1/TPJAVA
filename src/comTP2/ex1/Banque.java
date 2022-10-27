package comTP2.ex1;
public class Banque {
    private int NCompte;
    private float Solde;
    private String CIN;
    public Banque(int NCompte, float Solde, String CIN){
        this.NCompte = NCompte;
        this.Solde = Solde;
        this.CIN = CIN;
    }

    public void deposer(float somme){
        Solde+=somme;
        System.out.println(somme + " ajouté au compte "+ NCompte + " avec succes!");
    }

    public void retirer(float somme){
        if(Solde>+somme){
            Solde -= somme;
            System.out.println(somme + " retiré du compte "+ NCompte + " avec succes!");
            System.out.println("Solde restant: "+ Solde);
        }else {
            System.out.println("Solde insufisant!");
        }
    }

    public float avoirSolde(){
        return Solde;
    }

    public int avoirNCompte(){
        return NCompte;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "NCompte=" + NCompte +
                ", Solde=" + Solde +
                ", CIN='" + CIN + '\'' +
                '}';
    }

    public String avoirInf(){
        return CIN;
    }

}

package comTP2.ex1;

public class Test {
    public static void main(String args[]){
        Banque nvcompte = new Banque(1, 5000.75f, "AB 1200");
        System.out.println("Les informations du compte numero: "+ nvcompte.avoirNCompte());
        System.out.println("CIN: " + nvcompte.avoirInf());
        System.out.println("Solde: " + nvcompte.avoirSolde());
        nvcompte.deposer(500);
        System.out.println("Les informations du compte numero: "+ nvcompte.avoirNCompte());
        System.out.println("CIN: " + nvcompte.avoirInf());
        System.out.println("Solde: " + nvcompte.avoirSolde());
        nvcompte.retirer(200);
        System.out.println("Les informations du compte numero: "+ nvcompte.avoirNCompte());
        System.out.println("CIN: " + nvcompte.avoirInf());
        System.out.println("Solde: " + nvcompte.avoirSolde());
    }
}

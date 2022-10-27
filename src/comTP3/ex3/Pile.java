package comTP3.ex3;

public class Pile {
    private final static int taille = 10;
    private Object [] pile;
    private int pos;
    public Pile(){
        pile = new Object[taille];
    }

    public void afficherPile(){
        for(int i=0; i<taille; i++){
            System.out.print(pile[i] + " -> ");
        }
        System.out.println("NULL");
    }


    public void empiler(Object x){
        try{
            if(pos<taille){
                pile[pos] = x;
                pos++;
            }else throw new PilePleine("Pile Pleine");
        }catch (PilePleine e){
            System.out.println(e.getMessage());
        }
    }

    public void depiler(){
        try{
            if(pos>0) System.out.println(pile[pos]);
            else throw new PileVide("Pile Vide");
        }catch(PileVide e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String []args) throws PilePleine, PileVide {
        Pile p = new Pile();
        p.depiler();
        p.afficherPile();

    }
}

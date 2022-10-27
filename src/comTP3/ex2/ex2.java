package comTP3.ex2;



public class ex2 {

    public static void main(String[] args) throws NumberFormatException {
        try {
            String  tab[] = {"1", "2", "3", "4"};
            int somme = 0;
            for(int i=0; i<4; i++){
                somme += Integer.parseInt(tab[i]);
            }
            System.out.println("La somme est: "+ somme);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " EXCEPTION GENEREE");
        }
    }
}
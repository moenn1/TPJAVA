package comTP1.ex8;

public class ex8 {
    static int n;
    public ex8(int N){
        n = N;
    }
    static boolean nbrPremier(){
        int i=n-1;
        while(i>1){
            if(n%i==0) return false;
            i--;
        }
        return true;
    }

    static public void main(String args[]){
        ex8 prem = new ex8(19);
        System.out.print(ex8.nbrPremier());
    }
}

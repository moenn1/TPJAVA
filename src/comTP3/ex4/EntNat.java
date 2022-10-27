package comTP3.ex4;

public class EntNat {
    int N;
    public EntNat(int x) throws ErrConst{
        try{
            if(x<0) throw new ErrConst("Valeur negative");
            else N = x;
        }catch (ErrConst e){
            System.out.println(e.getMessage());
        }
    }

    public int getN(){
        return N;
    }

    public void setN(int x) {
        try{
            if(x<0) throw new ErrModif("Valeur negative");
            else N = x;
        }catch (ErrModif e){
            System.out.println(e.getMessage());
        }
    }

    public void decremente(){
        try{
            if(N==0) throw new ErrModif("Valeur 0 atteint");
            else N--;
        }catch (ErrModif e){
            System.out.println(e.getMessage());
        }
    }

    public void decremente(EntNat e) {
        try{
            if(this.N<e.N) throw new ErrModif("Valeur 0 atteint");
            else this.N-=e.N;
        }catch (ErrModif p){
            System.out.println(p.getMessage());
        }
    }

    public static void decrementeValue(EntNat obj){
            obj.decremente();
    }

    public static void main(String []args){

    }

}

package comTP1.ex7;

public class ex7 {
    static final int u0 = 1;
    static final int u1 = 2;
    static int n;
    public ex7(int N){
        N = n;
    }
    static int fibo(int n){
        if(n<=3) return u0 + u1;
        else return fibo(n-1)+fibo(n-2);
    }

    static int getN(){
        return n;
    }

    public static void main(String []args){
        ex7 f = new ex7(10);
        ex7.fibo(getN());
    }
}

package comTP1.ex6;

public class ex6 {
    static int n;
    public ex6(int N){
        n = N;
    }
    static void drawTriangle(){
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        ex6 triangle = new ex6(10);
        ex6.drawTriangle();
    }
}

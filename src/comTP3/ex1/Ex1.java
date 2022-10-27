package comTP3.ex1;

public class Ex1 {
    static int divParZero(int x){
        return x/0;
    }

    public static void main(String []args) throws ArithmeticException{
        int a;
        try{
                   a  = divParZero(5);
               }
        catch(Exception e){
            System.out.println("Division par zero " + e.getMessage());
        }finally {
            a = 5/1;
        }
    }
}

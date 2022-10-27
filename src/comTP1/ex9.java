package comTP1;

import java.util.Random;
import java.util.Scanner;

public class ex9 {
    static Random r = new Random();

    static int n;
    public ex9(int N){
        n = N;
    }

    static public int generateNbr(){
        return r.nextInt(100);
    }

    static boolean matchingNumber(int x){
        if(n == x)  return true;
        return false;
    }

    public static void main(String args[]){
        ex9 p = new ex9(19);
        int r = generateNbr();
        int k = 1;
        boolean matching = false;
        while(!matching){
            matching = matchingNumber(r);
            if(matching == true){

            }
            k++;
        }

    }

}

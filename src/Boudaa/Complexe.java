package Boudaa;

import static java.lang.Math.*;

public class Complexe {
    private double a;
    private double b;

    public Complexe(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getReel() {
        return a;
    }

    public double getImag() {
        return b;
    }

    public void setAReel(double a) {
        this.a = a;
    }

    public void setImag(double b) {
        this.b = b;
    }

    public Complexe conjugue(){
        return new Complexe(a, -b);
    }

    public boolean equals(Complexe z) {
        return a==z.a && b == z.b;
    }

    @Override
    public String toString() {
        return a+ " + i*"+b;
    }

    public double argument(){
        if(a!=0)  return atan(b/a);
        else return 0;
    }

    public double norme(){
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    public double distance(Complexe z){
        double x = a-z.a;
        double y = b-z.b;
        return sqrt(pow(x, 2) + pow(y, 2));
    }
}

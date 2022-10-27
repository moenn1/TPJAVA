package comTP2.ex3;

import java.util.Objects;

public class Robot {
    private int Abs;
    private int Ord;
    private String Orientation;
    public Robot(){
        Abs = Ord = 0;
        Orientation = "H"; //HAUT par defaut
    }
    public Robot(int Abs, int Ord, String Orientation){
        this.Abs = Abs;
        this.Ord = Ord;
        this.Orientation = Orientation;
    }

    public void avancer(){
        if(Objects.equals(Orientation, "H")) Abs++;
        if(Objects.equals(Orientation, "B")) Abs--;
        if(Objects.equals(Orientation, "D")) Ord++;
        if(Objects.equals(Orientation, "G")) Ord--;
    }

    public void tournerDroit()
    {
        int aide = Ord;
        Ord = Abs;
        Abs = -aide;
        if(Objects.equals(Orientation, "H")) Orientation = "D";
        if(Objects.equals(Orientation, "D")) Orientation = "B";
        if(Objects.equals(Orientation, "B")) Orientation = "G";
        if(Objects.equals(Orientation, "G")) Orientation = "H";
    }

    public void tournerGauche()
    {
        int aide = Ord;
        Ord = -Abs;
        Abs = -Ord;
        if(Objects.equals(Orientation, "H")) Orientation = "G";
        if(Objects.equals(Orientation, "D")) Orientation = "H";
        if(Objects.equals(Orientation, "B")) Orientation = "D";
        if(Objects.equals(Orientation, "G")) Orientation = "B";
    }
    public static void main(String [] args){

    }

}

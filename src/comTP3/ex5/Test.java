package comTP3.ex5;

public class Test {
    public static void main(String args[]) throws RetraitInterdit, CodeIncorrect {
        Compte c = new Compte("en-nassibi", "mohamed", 5000, "azerty123");
        c.depot(500);
        System.out.println(c.toString());
        CompteAvecDecouvert c2 = new CompteAvecDecouvert("elhaddadi", "mo", 40, "haha1", 400);
        c2.retrait(4400, "haha1");
        //c.retrait(300, "azerty12");
    }
}
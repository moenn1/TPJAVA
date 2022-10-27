package DataStructures.ListeChainee;

public class TestListe {
    public static void main(String []args){
        List l = new List(5);
        l.add(12);
        l.add(12.3f);
        l.add("hello");
        //l.deleteBegin();
        l.add(13.1);
        //l.deleteLast();
        l.deletePos(3);
        l.print();
    }
}

//5 -> 12 -> 12.3 -> hello -> 13.1 -> NULL
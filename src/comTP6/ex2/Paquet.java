package comTP6.ex2;

import java.util.*;
import java.util.function.Consumer;

public class Paquet<T> implements Iterable<T> {

    T[] tab = (T[]) new Object[50];
    int size = 0;

    public Paquet(T[] tab) {
        this.tab = Arrays.copyOf(tab, this.tab.length);
        size = tab.length;
    }

    public void add(T e){
        if(size<=50){
            tab[size] = e;
            size++;
        }else{
            System.out.println("Paquet rempli!");
        }
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            int cur = -1;

            @Override
            public boolean hasNext() {
                cur++;
                return cur < size;
            }

            @Override
            public T next() {
                return tab[cur];
            }

        };

    }

    @Override
    public String toString() {
        String s = "";
        Iterator<T> it = iterator();
        while(it.hasNext()){
            s += it.next() + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Paquet<Integer> p = new Paquet<Integer>(new Integer[]{1, 2, 3, 5});

        p.add(50);

        System.out.println(p);

        System.out.println();
        for( Integer e : p){
            System.out.print(e+ "  ");
        }
    }
}

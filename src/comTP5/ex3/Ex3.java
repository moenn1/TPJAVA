package comTP5.ex3;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Ex3 {

    //Lecture et ecriture ligne par ligne
    public static void qst1_1() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file/entree.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file/sortie.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Lecture et ecriture char par char
    public static void qst1_2() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file/entree.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file/sortie.txt"));
            int line;
            while ((line = reader.read()) != -1) {
                writer.write((char) line);
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void qst2() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(i + " " + line);
                i++;
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String qst3() {
        String longest = "";
        String[] parts;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                parts = line.split("\\s+");
                for (String i : parts) {
                    if (i.length() > longest.length()) {
                        longest = i;
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return longest;
    }


    public static int qst4() {
        int count = 0;
        String[] parts;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                parts = line.split("\\s+");
                for (String i : parts) {
                    count++;
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    //qst 5
    public static void appendText() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Saisir le text a appender: ");
            String l = s.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt", true));
            writer.write(l);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void qst6(){
        Reel r = new Reel(0.3);
        r.remplissezFichier();
    }

    public static void qst9() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputlines.txt"));
            int count;
            String line;
            String [] words;
            while((line = reader.readLine()) != null){
                words = line.split("\\s+");
                writer.write(words.length + "\n");
            }
            reader.close();
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void qst10(){
        System.out.print("Saisir le nom du fichier (.txt): ");
        Scanner s = new Scanner(System.in);
        String filename = s.nextLine();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename+".txt"));
            int count = 0;
            String line;
            while((line = reader.readLine()) != null){
                count++;
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename + count +".txt"));
            writer.write(count);
            reader.close();
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void qst11(char c){
         //Ecrire un programme permettant de remplacer aléatoirement un de ses caractères par « ! »

        try{
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            int count = 0;
            String line;
            while((line = reader.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == c){
                        writer.write('!');
                    }else{
                        writer.write(line.charAt(i));
                    }
                }
            }
            reader.close();
            writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void qst12(String[] strings){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            for(String s: strings){
                writer.write(s + "\n");
            }
            writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] sss = {"hello", "pz", "nijn"};
        qst12(sss);
    }
}


class Reel {
    double n;

    public Reel(double x){
        this.n = x;
    }

    public void remplissezFichier(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("reel.txt"));
            for(int i=1; i<6; i++){
                writer.write(i + " " + (this.n*i) + "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

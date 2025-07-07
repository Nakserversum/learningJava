package basis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String text = "Hallo Welt!";
        System.out.println(text);

        int ergebnisAddition = addition(12,6); // Aufruf der Funktion addition und Übergabe 2er-Zahlen als Argument
        System.out.println(ergebnisAddition); // Ausgabe des Ergebniswertes der Funktion addition


        Random random = new Random(); // Erstellt ein Random-Objekt
        int zahl = random.nextInt(10) + 1; // Erzeugt eine Zufallszahl zwischen 1 und 10 //
        //2. Zufallszahl ausgeben
        System.out.println("Die erzeugte Zufallszahl ist: " + zahl);
        if (zahl > 5) {
            // wenn zahl größer 5, dann...
            System.out.println("Zahl ist größer 5");
        } else if (zahl < 5) {
            // sonst, wenn zahl kleiner 5, dann...
            System.out.println("Zahl ist kleiner 5");
        } else {
            // sonst (wenn sie weder größer noch kleiner ist, muss sie genau 5 sein)
            System.out.println("Zahl ist genau 5");
        }
    }

    // Funktion (Methode) zur Addition zweier Zahlen
    public static int addition(int zahl1,int zahl2){
        return zahl1 + zahl2;
    }
}

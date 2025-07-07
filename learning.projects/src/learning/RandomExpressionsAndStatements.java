package learning;
import java.util.Optional;
import java.util.Random;

public class RandomExpressionsAndStatements {

    public static void main(String[] args) {

        Random random = new Random();

        // Generiere Zufallszahlen zwischen 0 und 99
        int X = random.nextInt(10);
        int Y = random.nextInt(10);
        int Z = random.nextInt(10);

        // Ausgabe der Werte
        //System.out.println("X: " + X);m
        //System.out.println("Y: " + Y);
        //System.out.println("Z: " + Z);
        System.out.println("X: " + X +",Y: " + Y + ", Z: " + Z);

        // Vergleiche und Ausgabe der Ergebnisse
        System.out.println("X == Y: " + (X == Y));
        System.out.println("X == Z: " + (X == Z));
        System.out.println("Y == Z: " + (Y == Z));

        // Überprüft ob alle Werte gleich sind
        if (X == Y && Y == Z) {
            System.out.println("All three Values are equal");
        } else {
            if (X == Y) {
                System.out.println("X and Y are equal, but not z");
            }
            if (X == Z) {
                System.out.println("X and Z are equal, but not Y");
            }
            if (Y == Z) {
                System.out.println("Y and Z are equal, but not X");
            } else if (X != Y && X != Z && Y != Z) {
                System.out.println("All three values are different");
            }
        }
    }
}


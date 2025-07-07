package learning;
import java.util.Random;

public class ExpressionsAndStatements {

    public static void main(String[] args) {

        Random random= new Random();


        // Generiere Zufallszahlen zwischen 0 und 99
        double X = random.nextDouble(100);
        double Y = random.nextDouble(100);
        double Z = random.nextDouble(100);


        System.out.println("X: " + X +",Y: " + Y + ", Z: " + Z);

        System.out.println("X == Y: " + (X == Y));
        System.out.println("X == Z: " + (X == Z));
        System.out.println("Y == Z: " + (Y == Z));


        if (X > Y) {
            System.out.println("X is bigger than Y");
        }
        if (X < Y) {
            System.out.println("X is smaller than Y");
        }
        if (X > Z) {
            System.out.println("X is bigger than Z");
        }
        if (X < Z) {
            System.out.println("X is smaller than Z");
        }
        if (X == Y) {
            System.out.println("Z and Y have the same value");
        } else {
            boolean b = (X == Z); {
                if (b) {
                    System.out.println("X and Z are in the same value");
        }
            }
        }
        if (Z > X) {
            System.out.println("Z is bigger than X");
        }
        if (Z != X) {
            System.out.println("Z and X are not equal");
        } else {
            boolean b = (Y < Z); {
                if (b) {
                    System.out.println();
                }
            }
            System.out.print("Z is the smallest.");
        }
    }
}

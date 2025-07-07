package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl;
        boolean isCorrect = false;


        System.out.println("Hello and welcome");

        do {
            if (isCorrect) {
                System.out.println("Die Eingabe muss wirklich zwischen 4 und 20 sein; ");
            }
            System.out.print("Bitte gebe hier eine Zahl zwischen 4 und 20 ein: ");
            try {
                zahl = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bitte nur Ganzzahlen eingeben");
                scanner.next();
                zahl = -7;
            }
            isCorrect = true;
        } while (zahl < 4 || zahl > 20);
        System.out.println("Eingabe war korrekt: " + zahl);

        for (int i = 1; i <= zahl; i++) {
            System.out.println("i: " + i);
        }
    }
}
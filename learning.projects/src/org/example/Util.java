package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    static int integerAbfrage(String abfrageAufforderung) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 0;

        System.out.print(abfrageAufforderung + ": ");

        try {
            zahl = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Bitte nur Ganzzahlen eingeben");
            scanner.next();
        }
        return zahl;
    }
}


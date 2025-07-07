package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Kontrollstrukturen {
    public static void main(String[] args) {
        erweitertesFor();
    }

    public static void ifBeispiel() {
        //Verzweigung (if)
        //eine einfache Verzweigung: if-else; if und else sind Schlüsselwörter
        // zu Beginn steht eine überprüfung auf einen mathematischen Wahrheitswert (true oder false)
        System.out.println("\nVerzweigung (IF)");

        // Beispiel 1:
        boolean istTeigzuWeich = true;
        if (istTeigzuWeich) {
            System.out.println("Gib Mehl dazu");
        } else {
            System.out.println("Lasse alles so wie es ist");
        }
    }
    private static void ifElseBeispiel() {
        //Beispiel 2:
        int backofenTemperatur = Util.integerAbfrage("Bitte gib die Backofentemperatur ein");

        if (backofenTemperatur < 120) {
            System.out.println("Drehe die Temperatur hoch!");
        } else if (backofenTemperatur > 120) {
            System.out.println("Drehe die Temperatur herunter");
        } else {
            System.out.println("Die Temperatur ist Korrekt");
        }
    }

        private static int integerAbfrage(String abfrageAufforderung) {
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
    private static void switchBeispiele() {
        // statische Methoden kann ich ohne  Instanzierung nur mit dem Klassennamen
        // aufrufen
        int switchVariable = Util.integerAbfrage("Gib eine ");

        // switch is eine Merfachverzweigung
        // nach einem Codeblock sollte man sich überlegen, ob man aus der Switch-Anweisung herrausbricht.
        switch (switchVariable) {
            case 1:
                System.out.println("Du hast die eins gewählt!");
                break;
            case 2:
                System.out.println("Du hast nun die zwei. ");
                break;
            case 3:
                System.out.println("Das ist ja schon höhere Mathematik");
                break;
            default:
                System.out.println("Ich wollte nur Zahlen zwischen 1 und 3");
        }

    }

    private static void erstesFor() {
        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("i : " + i);
        }
    }

    private static void erweitertesFor() {
        /*
        Frucht frucht = new Frucht();
        frucht.setName("Apfel");
        frucht.setGewicht(200);

        Frucht frucht2 = new Frucht();
        frucht2.setName("Mango");
        frucht2.setGewicht(400);


        System.out.println(frucht.getName() + " : " + frucht.getGewicht());
        */
        List<Frucht> fruechte = new ArrayList<>();
        /*
        System.out.println("Früchte in der Liste: " + fruechte.size());
        fruechte.add(new Frucht());



        System.out.println("Früchte in der Liste: " + fruechte.size());
        */

        for (int i = 0; i < 4; i++) {
            fruechte.add(new Frucht());
        }
        System.out.println("Früchte in der Liste: " + fruechte.size());

        int apfelGewicht = 100;
        for(Frucht frucht : fruechte) {
            frucht.setName("Apfel");
            frucht.setGewicht(apfelGewicht);
            apfelGewicht = apfelGewicht * 2;
        }

        System.out.println("Name überprüfen: " + fruechte.get(2).getName());
        System.out.println("Gewicht überprüfen: " + fruechte.get(0).getGewicht());
        System.out.println("Gewicht überprüfen: " + fruechte.get(3).getGewicht());

    }



}

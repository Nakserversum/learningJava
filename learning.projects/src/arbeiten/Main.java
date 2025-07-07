package arbeiten;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weiter = "ja"; // Initialisierung, um die Schleife zu starten

        System.out.println("Willkommen beim lebenden Taschenrechner");

        while (weiter.equalsIgnoreCase("ja")) {
            System.out.print("Bitte gebe dir erste Zahl ein: ");
            double zahl1 = scanner.nextDouble();

            System.out.print("Bitte gebe die zweite Zahl ein: ");
            double zahl2 = scanner.nextDouble();

            System.out.println("Wähle die Stellung aus (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double ergebnis;

            switch (operation) {
                case '+':
                    ergebnis = zahl1 + zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '-':
                    ergebnis = zahl1 - zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '*':
                    ergebnis = zahl1 * zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case '/':
                    if (zahl2 != 0) { // Überprüfung von zahl2, um Division durch Null zu vermeiden
                        ergebnis = zahl1 / zahl2;
                        System.out.println("Ergebnis: " + ergebnis);
                    } else {
                        System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                    }
                    break;
                default:
                    System.out.println("Operation ist nicht bekannt");
                    break;
            }

            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            weiter = scanner.next(); // Aktualisierung der Schleifenbedingung
        }

        scanner.close();
        System.out.println("Programm beendet.");
    }
}


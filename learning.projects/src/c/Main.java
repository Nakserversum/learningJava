package basis.c;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {57, 23, 89, 12, 45};
        int[] array = new int[12];

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("\nZweites Array: ");
        for(int i = 0; i < array.length;i++){
            if(i % 2 == 0){
                array[i] = i*2;
            }
            else{
                array[i]=i;
            }
        }

        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }


        Random random = new Random(); // Random Objekt erzeugt
        int wurf;
        do {
            wurf = random.nextInt(6) + 1; // Würfelt eine Zahl zwischen 1 und 6
            System.out.println("Du hast eine " + wurf + " gewürfelt.");
        } while (wurf != 6); // Wiederholt, solange bis das Ergebnis 6 ist
        // Ausgabe könnte sein:
        // Du hast eine 4 gewürfelt.
        // Du hast eine 3 gewürfelt.
        // Du hast eine 6 gewürfelt.
        // Schleife endet, da 6 == 6


        String[] namen = {"Alice", "Bob", "Charlie","Barny"};

        for (String name : namen) {
            if(name.charAt(0)=='B'){
                System.out.println("Name: " + name);
            }
        }
        // Ausgabe:
        // Name: Alice
        // Name: Bob
        // Name: Charlie

    }
}

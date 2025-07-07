package arbeiten2;

import java.util.Optional;
import java.util.Random;

public class arbeiten2 {
    public static void main(String[] args) {
        int[] numbers = {57, 23, 89, 12, 45};
        int[] array = new int[12];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nZweites Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = i * 2;
            } else {
                array[i] = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}



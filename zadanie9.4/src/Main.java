import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);

        System.out.println("Zawartość tablicy:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                array[i] = 0;
            }
        }
    }

    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
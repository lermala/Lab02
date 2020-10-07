import java.util.InputMismatchException;
import java.util.Scanner;

public interface Input {

    static String inputString(String message) {
        Scanner input = new Scanner(System.in);
        String line = "";
        try {
            System.out.print(message);
            line = input.nextLine();
            if (line.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("\nIncorrect input. Enter a non-empty string\n");
            line = inputString(message);
        }
        return line;
    }

    static float inputFloat(String message) {
        Scanner input = new Scanner(System.in);
        float number = 0;
        try {
            System.out.print(message);
            number = input.nextFloat();
            if (number > Float.MAX_VALUE || number < Float.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("\n        Incorrect input. Enter the number.\n");
            number = inputFloat(message);
        }
        return number;
    }


    static int inputInteger(String message) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        try {
            System.out.print(message);
            number = input.nextInt();
            if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input. Enter an integer.\n");
            number = inputInteger(message);
        }
        return number;
    }
}

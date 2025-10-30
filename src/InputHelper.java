import java.util.Scanner;
public class InputHelper {
    //getNonZeroLenString returns a String of non-zero length
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        boolean valid = false;
        String userInput;
        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (!userInput.isEmpty()) {
                valid = true;
            } else {
                System.out.println("Error: Enter a string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }

    //The getInt method returns a valid int value back to the user
    public static int getInt(Scanner scan, String prompt) {
        boolean valid = false;
        int userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error: Enter an integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        boolean valid = false;
        int userInput = 0;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + min + " and " + max + ".");
                    scan.nextLine();
                }
            }
            else {
                System.out.println("Error: Enter an integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }
}

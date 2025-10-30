import java.util.Scanner;
public class MainTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan, "Enter your name");
        System.out.println(name);
        int favoriteNumber = InputHelper.getInt(scan, "What is your favorite number?");
        System.out.println(favoriteNumber);
        int numGuess = InputHelper.getRangedInt(scan, "Guess a number between 1-10", 1, 10);
        System.out.println("You guessed " + numGuess);
    }
}

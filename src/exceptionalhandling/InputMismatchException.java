package exceptionalhandling;
import java.util.Scanner;
public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int integer = scanner.nextInt();
        scanner.close();

        System.out.println("You entered: " + integer);
    }
}
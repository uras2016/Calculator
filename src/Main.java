import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Calculator ===");
        System.out.println("Please, enter your expression:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Result: " + Calculator.calculate(line));
    }
}
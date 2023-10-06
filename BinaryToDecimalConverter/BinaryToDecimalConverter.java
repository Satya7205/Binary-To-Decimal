import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter a Binary number (Or type 'exit' to Quit):");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank You....");
                break;
            }

            int decimal = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '1') {
                    decimal += Math.pow(2, input.length() - 1 - i);
                }
            }

            System.out.println("The Decimal Value of the Binary Number " + input + " is " + decimal + ".");
        } while (true);
    }
}
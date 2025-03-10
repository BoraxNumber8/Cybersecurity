import java.util.Scanner;

public class BinaryDecimalHexConversions {
    public static void main (String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("What would you like to convert?");
            String input = scan.nextLine();
            if (input.equals("binary to decimal")) {
                System.out.println("Enter a binary number:");
                String binary = scan.nextLine();
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("Decimal equivalent of " + binary + " is " + decimal);
            }

            if (input.equals("decimal to binary")) {
                System.out.println("Enter a decimal number:");
                int decimal = scan.nextInt();
                String binary = Integer.toBinaryString(decimal);
                System.out.println("Binary equivalent of " + decimal + " is " + binary);
            }

            if (input.equals("hex to decimal")) {
                System.out.println("Enter a hexadecimal number:");
                String hex = scan.nextLine();
                int decimal = Integer.parseInt(hex, 16);
                System.out.println("Decimal equivalent of " + hex + " is " + decimal);
            }

            if( input.equals("decimal to hex")) {
                System.out.println("Enter a decimal number:");
                int decimal = scan.nextInt();
                String hex = Integer.toHexString(decimal);
                System.out.println("Hexadecimal equivalent of " + decimal + " is " + hex);
            }

            if( input.equals("hex to binary")) {
                System.out.println("Enter a hexadecimal number:");
                String hex = scan.nextLine();
                int decimal = Integer.parseInt(hex, 16);
                String binary = Integer.toBinaryString(decimal);
                System.out.println("Binary equivalent of " + hex + " is " + binary);
            }

            if( input.equals("binary to hex")) {
                System.out.println("Enter a binary number:");
                String binary = scan.nextLine();
                int decimal = Integer.parseInt(binary, 2);
                String hex = Integer.toHexString(decimal);
                System.out.println("Hexadecimal equivalent of " + binary + " is " + hex);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

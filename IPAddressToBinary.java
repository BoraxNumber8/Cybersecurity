import java.util.Scanner;

public class IPAddressToBinary {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the IP address:");
            String ip = scan.nextLine();
            String[] splitIP = ip.split("\\.");
            StringBuilder binaryIP = new StringBuilder();
            for (String part : splitIP) {
                String binaryPart = Integer.toBinaryString(Integer.parseInt(part));
                while (binaryPart.length() < 8) {
                    binaryPart = "0" + binaryPart;
                }
                binaryIP.append(binaryPart + ".");
            }
            System.out.println("Binary equivalent of " + ip + " is " + binaryIP);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

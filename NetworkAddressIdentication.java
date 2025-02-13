import java.util.Scanner;

public class NetworkAddressIdentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the IP address:");
        String ip = scan.nextLine();
        System.out.println("Enter the subnet mask:");
        String subnet = scan.nextLine();

        String[] splitIP = ip.split("\\.");
        String[] splitSubnet = subnet.split("\\.");
        String[] networkParts = new String[4];
        for (int i = 0; i < 4; i++) {
            networkParts[i] = String.valueOf(Integer.parseInt(splitIP[i]) & Integer.parseInt(splitSubnet[i]));
        }
        String networkAddress = String.join(".", networkParts);
        System.out.println("Network Address: " + networkAddress);
    }
}

import java.net.*;
import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hostname: ");
        String hostname = scanner.nextLine();
	//type  "hostname" on cmd to get host name of your pc
        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            System.out.println("IP address of " + hostname + " is: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to retrieve IP address for the given hostname.");
        }
    }
}

// cmd commnd for hostname is :-    hostname

import java.net.*;

public class Question_19 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.msbte.org.in");
            
            // Get the protocol
            System.out.println("Protocol: " + url.getProtocol());
            
            // Get the host
            System.out.println("Host: " + url.getHost());
            
            // Get the port (returns -1 if no specific port is defined)
            System.out.println("Port: " + url.getPort());
            
            // Get the file part of the URL
            System.out.println("File: " + url.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}


import java.io.PrintWriter;
import java.net.Socket;

public class HelloClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter out = new PrintWriter(
                     socket.getOutputStream(), true)) {

            out.println("Hello Server");
            System.out.println("Message sent to server.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

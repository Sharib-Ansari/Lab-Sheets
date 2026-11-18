
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Server waiting for client...");

            try (Socket client = server.accept()) {
                System.out.println("Client connected");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

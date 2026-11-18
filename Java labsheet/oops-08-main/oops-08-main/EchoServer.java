
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5001)) {
            System.out.println("Echo server started...");

            try (Socket client = server.accept();
                 BufferedReader in = new BufferedReader(
                         new InputStreamReader(
                                 client.getInputStream()));
                 PrintWriter out = new PrintWriter(
                         client.getOutputStream(), true)) {

                String message = in.readLine();

                System.out.println("Received: " + message);
                out.println(message);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

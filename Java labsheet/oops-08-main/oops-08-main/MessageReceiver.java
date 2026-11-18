
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class MessageReceiver {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(6000)) {
            byte[] buffer = new byte[1024];

            System.out.println("Waiting for UDP message...");

            DatagramPacket packet =
                    new DatagramPacket(buffer, buffer.length);

            socket.receive(packet);

            String message = new String(
                    packet.getData(),
                    packet.getOffset(),
                    packet.getLength(),
                    StandardCharsets.UTF_8);

            System.out.println("Received: " + message);
            System.out.println("From: "
                    + packet.getAddress().getHostAddress());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

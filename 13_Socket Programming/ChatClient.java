import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            // Create threads for sending and receiving messages
            new Thread(new MessageReceiver(socket)).start();
            new Thread(new MessageSender(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

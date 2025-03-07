import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create threads for sending and receiving messages
            new Thread(new MessageReceiver(socket)).start();
            new Thread(new MessageSender(socket)).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

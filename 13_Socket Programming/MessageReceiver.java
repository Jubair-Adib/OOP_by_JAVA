import java.io.*;
import java.net.*;

public class MessageReceiver implements Runnable {
    private BufferedReader reader;

    public MessageReceiver(Socket socket) throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Received: " + message);
            }
        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }
}

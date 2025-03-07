import java.io.*;
import java.net.*;

public class MessageSender implements Runnable {
    private PrintWriter writer;
    private BufferedReader consoleReader;

    public MessageSender(Socket socket) throws IOException {
        this.writer = new PrintWriter(socket.getOutputStream(), true);
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        try {
            String message;
            while ((message = consoleReader.readLine()) != null) {
                writer.println(message);
            }
        } catch (IOException e) {
            System.out.println("Connection closed.");
        }
    }
}

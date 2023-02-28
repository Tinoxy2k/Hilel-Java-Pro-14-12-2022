import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8081);
             DataOutputStream request = new DataOutputStream(socket.getOutputStream());
             DataInputStream answer = new DataInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {


            while (scanner.hasNextLine()) {
                String mеssage = scanner.nextLine();
                request.writeUTF(mеssage);
                System.out.println("Response from the server: " + answer.readUTF());
            }
        } catch (IOException e) {
            System.out.println("Server is unreachable");
        }
    }
}

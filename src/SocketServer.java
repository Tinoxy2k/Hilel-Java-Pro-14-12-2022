import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.regex.Pattern;

public class SocketServer {
    public static String rightAnswer = "хліб";
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081);
             Socket accept = serverSocket.accept();
             DataInputStream request = new DataInputStream(accept.getInputStream())) {
            DataOutputStream answer = new DataOutputStream(accept.getOutputStream());

            if (!Pattern.matches(".*[ЁёъыЭэ].*", request.readUTF())) {
                new LocalDateClass(answer).answerLocalDate();
            } else {
                answer.writeUTF("Що таке паляниця?");
                if (rightAnswer.equals(request.readUTF())) {
                    new LocalDateClass(answer).answerLocalDate();
                } else {
                    answer.writeUTF("Неправильно!Надсилаю запит в СБУ");
                    accept.close();

                }
            }
        } catch (IOException e) {
            System.out.println("Щось пішло не так: " + e.getMessage());


        }
    }
}

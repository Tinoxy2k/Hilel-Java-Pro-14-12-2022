import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateClass {

    private final DataOutputStream dataOutputStream;

    public LocalDateClass(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }

    public void answerLocalDate() throws IOException {
        LocalTime Time = LocalTime.now().withNano(0);
        LocalDate Date = LocalDate.now();

        String answer =
                String.format("Привіт, дата сьогодні " + Date + " час: " + Time);
        dataOutputStream.writeUTF(answer);
    }
}

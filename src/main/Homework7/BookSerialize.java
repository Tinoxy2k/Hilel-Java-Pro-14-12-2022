package main.Homework7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookSerialize {
    public void serialize(BookStatistic book, File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(book.toString());
        writer.close();
    }
}

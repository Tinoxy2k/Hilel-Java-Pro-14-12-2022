package main.Homework7;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BookParser parser = new BookParser();
        BookSerialize bookSerialize = new BookSerialize();


        final String PATH = "src/main/resources/";
        boolean exitCommand = false;


        while (!exitCommand) {
            System.out.println("Enter the name of the book : ");
            File file = new File(PATH + scanner.next().trim());
            System.out.print("""
                      Welcome to book parser.
                     --------------------------
                     Choose an option:
                     1 - Show statistic of 10 top words.
                     2 - Count unique words.
                     3 - Parse and write to log file.
                     4 - exit.
                    """);

            List<String> words = parser.getText(file);
            int command = scanner.nextInt();


            switch (command) {
                case 1 -> {
                    List<String> TopWords = parser.topWords(words, 10);
                    System.out.println(TopWords);
                }
                case 2 -> {
                    int UniqWords = parser.uniqWords(words);
                    System.out.println(UniqWords);

                }
                case 3 -> {
                    List<String> TopWords = parser.topWords(words, 10);
                    int UniqWords = parser.uniqWords(words);
                    BookStatistic statistic = new BookStatistic(TopWords, UniqWords);
                    bookSerialize.serialize(statistic, new File(PATH + file.getName() + "statistic.txt"));

                }


                case 4 -> exitCommand = true;

            }
        }


    }

}

package main.Homework7;


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class BookParser {
    private static final Pattern PATTERN_WORD = Pattern.compile("[^a-zA-Z']");

    public List<String> getText(File file) throws FileNotFoundException {
        BufferedReader readFile = new BufferedReader(new FileReader(file));
        List<String> words = readFile.lines()
                .map(line -> PATTERN_WORD.split(line.trim().replaceAll("\\s+", " ")))
                .flatMap(line -> Arrays.stream(line).map(String::toLowerCase))
                .filter(word -> word.length() > 2)
                .toList();
        try {
            readFile.close();
        } catch (IOException message) {
            message.printStackTrace();
        }

        return words;

    }

    public List<String> topWords(List<String> words, int amount) {
        return words.stream().distinct()
                .sorted(Comparator.comparingInt(word -> Collections.frequency(words, word)).reversed())
                .limit(amount)
                .toList();

    }

    public int uniqWords(List<String> words) {
        return new HashSet<>(words).size();
    }

}

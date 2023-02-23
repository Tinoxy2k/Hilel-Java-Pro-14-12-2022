package main.Homework7;

import java.util.List;

public class BookStatistic {
    private final List<String> topWords;
    private final int uniqueWords;

    public BookStatistic(List<String> topWords, int uniqueWords) {

        this.topWords = topWords;
        this.uniqueWords = uniqueWords;


    }

    @Override
    public String toString() {
        return "BookStatistic{" +
                "topWords=" + topWords +
                ", uniqueWords=" + uniqueWords +
                '}';
    }
}

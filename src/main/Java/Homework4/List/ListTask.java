package Homework4.List;

import java.util.*;

public class ListTask {
    public static void countOccurrence(List<String> list, String sentence) {
        int count = 0;
        for (String s : list) {
            if (s.equals(sentence)) {
                count++;
            }
        }

        System.out.println("Found matches of word  \"World\" - " + count);
    }

    public static void toList(Integer[] numbers) {
        System.out.println("Array " + Arrays.toString(numbers));
        List<Integer> list = Arrays.asList(numbers);
        System.out.println("List " + list);


    }

    public static void CalcOccurrence(List<String> list) {
        Set<String> string = new HashSet<>(list);
        for (String S : string)
            System.out.println(S + ":" + Collections.frequency(list, S));

    }

    public static void findUnique(List<String> list) {
        HashSet<String> List = new HashSet<>(list);
        System.out.println("The original ArrayList - " + list);
        System.out.println("Unique list - " + List);
    }

    public static HashMap<String, Integer> findOccurrence(List<String> listOfString) {
        HashMap<String, Integer> mapOfOccurrence = new HashMap<>();
        for (String s : listOfString) {
            if (mapOfOccurrence.containsKey(s)) {
                mapOfOccurrence.put(s, mapOfOccurrence.get(s) + 1);
            } else {
                mapOfOccurrence.put(s, 1);
            }
        }
        return mapOfOccurrence;
    }
}

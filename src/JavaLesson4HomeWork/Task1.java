package JavaLesson4HomeWork;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] words = {"postman", "power", "coll", "fox", "car", "bike", "smash", "pen", "java", "small", "wild", "set", "football", "java", "space", "event", "work", "lesson", "animal", "eagle"};

        // Task 1a)
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("-");

        // task 1b).
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

    }

    Phonebook phonebook = new Phonebook();

    phonebook.add("Marcov", "89998071783");
    phonebook.add("Abramov", "88895963366");
    phonebook.add("Lazarev", "81236544565");
    phonebook.add("Faizulin", "87896578588")

    System.out.println(phonebook.get("Petrov"));
}

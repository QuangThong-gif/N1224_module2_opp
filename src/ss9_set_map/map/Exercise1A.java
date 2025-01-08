package ss9_set_map.map;

import java.util.HashMap;
import java.util.Map;

public class Exercise1A {
    public static void main(String[] args) {
        String str = "Đây là văn bản!";

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = str.split(" ");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}

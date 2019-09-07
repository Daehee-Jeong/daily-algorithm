package programmers.test2019;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Query {
    public int[] solution(String[] words, String[] queries) {
        int[] results = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int matchLength = queries[i].length();
            Pattern p = Pattern.compile(queries[i].replaceAll("[?]", "[a-z]"));
            results[i] = (int) Arrays.stream(words)
                    .filter(word -> word.length() == matchLength)
                    .filter(word -> p.matcher(word).matches())
                    .count();
        }

        return results;
    }
}

package airpremiea;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String[] solutino(String[] movie) {

        Map<String, Integer> movieMap = new HashMap<>();
        for (int i=0; i<movie.length; i++) {
            if (movieMap.containsKey(movie[i])) {
                movieMap.put(movie[i], movieMap.get(movie[i]) + 1);
                continue;
            }
            movieMap.put(movie[i], 1);
        }

        return movieMap.keySet().stream()
                .map(key -> new Movie(key, movieMap.get(key)))
                .sorted()
                .map(m -> m.getName())
                .toArray(String[]::new);
    }
}

class Movie implements Comparable<Movie> {
    final String name;
    final int value;

    public Movie(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Movie movie) {
        if (this.value > movie.value) {
            return -1;
        }

        if (this.value < movie.value) {
            return 1;
        }

        return this.name.compareTo(movie.name);
    }
}
package baekjoon;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.PriorityQueue;

public class Quiz7662 {

    /**
     * [ INPUT ]
     * 2
     * 7
     * I 16
     * I -5643
     * D -1
     * D 1
     * D 1
     * I 123
     * D -1
     * 9
     * I -45
     * I 653
     * D 1
     * I -642
     * I 45
     * I 97
     * D 1
     * D -1
     * I 333
     *
     * [ OUTPUT ]
     * EMPTY
     * 333 -45
     */
    public String solution(String input) {



        String[] lines = input.split(System.getProperty("line.separator"));

        final int T = Integer.valueOf(lines[0]);

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        BufferedReader reader = new BufferedReader(new StringReader(input));

        return null;
    }
}

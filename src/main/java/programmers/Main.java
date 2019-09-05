package programmers;

import programmers.test2018.CandidateKey;
import programmers.test2018.FailRatio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String args[]) {
        /*JadenCase c = new JadenCase();
        String result = c.solution("hello my 3Ame is daehee");
        System.out.println(result);*/

        /*LCM lcm = new LCM();
        int result = lcm.solution(new int[]{2, 6, 8, 10});
        System.out.println("result is " + result);*/

        /*FailRatio ratio = new FailRatio();
        int[] result = ratio.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        int[] result = ratio.solution(4, new int[]{4, 4, 4, 4, 4});
        System.out.println(Arrays.toString(result));*/

        String[][] arr = new String[][]{
//            {"100","ryan","music","2"},
//                {"200","apeach","math","2"},
//                {"300","tube","computer","3"},
//                {"400","con","computer","4"},
//                {"500","muzi","music","3"},
//                {"600","apeach","music","2"}

            {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"100","con","computer","4"},
                {"200","muzi","music","3"},
                {"300","apeach","music","2"}
        };
        CandidateKey ck = new CandidateKey();
        System.out.println(ck.solution(arr));
    }
}
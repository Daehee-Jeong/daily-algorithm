package programmers;

import airpremiea.Quiz1;
import airpremiea.Quiz2;
import airpremiea.Quiz3;
import airpremiea.Quiz4;
import baekjoon.Quiz7662;
import programmers.test2018.CandidateKey;
import programmers.test2018.FailRatio;
import programmers.test2019.ZippedString;

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

        /*String[][] arr = new String[][]{
            {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}
        };
        CandidateKey ck = new CandidateKey();
        System.out.println(ck.solution(arr));*/

//        ZippedString zs = new ZippedString();
//        System.out.println(zs.solution("aabbaccc"));
//        System.out.println(zs.solution("acsxadvscdxavscdxavscdxscxdavscxdavcsxdvacs"));
//        zs.solution("ababcdcdababcdcd")
//        System.out.println(zs.solution("ababcdcdababcdcd"));
//        System.out.println(zs.solution("ababcdcdxababcdcd"));
//          System.out.println(zs.solution("xababcdcdababcdcd"));
//        System.out.println(zs.solution("abcabcabcabcdedededededeabcabcabcabcdedededededeabcabcabcabcdedededededeabcabcabcabcdedededededeabcabcabcabcdedededededeabcabcabcabcdedededededeabcabcabcabcdededededede"));

        /*Quiz7662 quiz7662 = new Quiz7662();
        quiz7662.solution();*/

        /*Quiz1 quiz1 = new Quiz1();
        String[] arr = {
            "RECEIVE abcd@naver.com",
            "RECEIVE zzkn@naver.com",
            "DELETE",
            "RECEIVE qwerty@naver.com",
            "SAVE",
            "SAVE",
            "DELETE",
            "RECEIVE QwerTY@naver.com",
            "SAVE"
        };
        quiz1.solution(arr);*/

//        Quiz1 quiz1 = new Quiz1();
//        int result = quiz1.solution(new int[]{1, 1, 9, 3, 7, 6, 5, 10}, 4);
//        System.out.println("result is " + result);

//        Quiz3 quiz3 = new Quiz3();
//        quiz3.solution(6, 25);
//        quiz3.solution(6, 1);
//                                1
//        2   3   4   5   6   7   8
//        9   10  11  12  13  14  15
//        16  17  18  19  20  21  22
//        23  24  25  26  27  28  29
//        30  31  1   2   3   4   5

//        Quiz2 quiz2 = new Quiz2();
//        System.out.println(quiz2.solution(new int[]{1, 1, 9, 3, 7, 6, 5, 10}, 4));

        Quiz4 quiz4 = new Quiz4();
        int[][] customer = new int[][]{{3, 1}, {2, 1}, {1, 1}, {2, 0}, {2, 1}};
        System.out.println(Arrays.toString(quiz4.solution(customer, 2)));
    }
}
package programmers;

public class Main {
    public static void main (String args[]) {
        /*JadenCase c = new JadenCase();
        String result = c.solution("hello my 3Ame is daehee");
        System.out.println(result);*/

        LCM lcm = new LCM();
        int result = lcm.solution(new int[]{2, 6, 8, 10});
        System.out.println("result is " + result);
    }
}

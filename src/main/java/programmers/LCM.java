package programmers;

public class LCM {

    /* 배열로 주어진 숫자들의 최소공배수 구하기*/
    public int solution(int[] arr) {
        /* 앞에서부터 두수의 최소공배수를 구하고, 그 최소공배수와 다음수의 최소공배수를 구하는 방법을 계속 해 나가면
        * 모든 수의 최소공배수를 구할 수 있다. */

        int answer = arr[0];
        for (int i=1; i<arr.length; i++) {
            answer = getLCM(answer, arr[i]);
        }

        return answer;
    }

    /* 최소공배수 구하기 */
    public int getLCM(int x, int y) {
        return x * y / getGCD(x, y);
    }

    /* 최대공약수 구하기 */
    public int getGCD(int x, int y) {
        while (y > 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}

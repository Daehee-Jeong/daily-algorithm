package airpremiea;

public class Quiz1 {

    public int solution(int[] estimates, int k) {
        int answer = 0;

        int maxJoinCount = 0;
        int ret = 0;
        for (int i=0; i<estimates.length; i++) {
            maxJoinCount = Math.max(maxJoinCount, 0) + estimates[i];
            ret = Math.max(maxJoinCount, ret);
        }

        answer = ret;

        return answer;
    }

}

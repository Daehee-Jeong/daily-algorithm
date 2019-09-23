package airpremiea;

public class Quiz2 {
    public int solution(int[] estimates, int k) {

        int max = 0;
        for (int i=0; i<=estimates.length-k; i++) {

            int sum = estimates[i];
            for (int j=1; j<k; j++) {
                sum += estimates[i+j];
            }

            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
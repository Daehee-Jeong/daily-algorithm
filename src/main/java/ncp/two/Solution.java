package ncp.two;

public class Solution {
    public int solution(int[] A) {
        if(A.length == 1) {
            return 1;
        }

        int index = A[0];
        int result = 1;
        while(true) {
            int temp = A[index];
            result++;
            if(temp == -1) {
                break;
            }

            index = temp;
        }

        return result;
    }
}

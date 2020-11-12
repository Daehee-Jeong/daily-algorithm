package codility;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int quotient = 0;
        int rest = N;

        // StringBuilder result = new StringBuilder();
        int maxBinaryGap = 0;
        int loopIndex = 0;
        int marker = -1;

        do {
            quotient = rest / 2;
            int binaryValue = rest - (quotient * 2);
            // result.append(binaryValue);

            if (binaryValue == 1) {
                if (marker != -1) {
                    int gap = loopIndex - marker - 1;
                    if (gap > maxBinaryGap) {
                        maxBinaryGap = gap;
                    }
                }
                marker = loopIndex;
            }

            rest = quotient;

            loopIndex ++;
        } while ( quotient != 0 );

        return maxBinaryGap;
    }
}

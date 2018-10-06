public class BinaryGap {
    public static int solution(int N) {
        int currentGap = 0;
        int longestGap = 0;

        boolean oneAppeared = false;

        while (N >= 1) {
            int remainder = N % 2;
            N = N / 2;

            if (remainder == 1) {
                if (currentGap > longestGap && oneAppeared) {
                    longestGap = currentGap;
                }
                currentGap = 0;
                oneAppeared = true;
            } else {
                currentGap++;
            }
        }
        return longestGap;
    }
}

public class PassingCars {
    public static int solution(int[] A) {
        int[] sums = new int[A.length + 1];
        long pairCounter = 0;

        sums[0] = 0;
        for (int i = 1; i < A.length + 1; i++) {
            sums[i] = sums[i - 1] + A[i - 1];
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                int passingCars = sums[sums.length - 1] - sums[i];
                pairCounter += passingCars;
            }
        }

        if (pairCounter > 1e9) {
            return -1;
        }

        return (int) pairCounter;
    }
}

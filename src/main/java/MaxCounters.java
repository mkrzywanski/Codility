public class MaxCounters {
    //Performance problems 77/100
    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maximumCounterValue = 0;

        for (int i = 0; i < A.length; i++) {
            int X = A[i];
            if (X <= N) {
                counters[X - 1] += 1;
                if (counters[X - 1] > maximumCounterValue) {
                    maximumCounterValue = counters[X - 1];
                }

            } else {
                for (int j = 0; j < N; j++) {
                    counters[j] = maximumCounterValue;
                }
            }
        }
        return counters;
    }

    //100/100
    public static int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int maximumCounterValue = 0;
        int lastMaximumCounterValue = 0;

        for (int i = 0; i < A.length; i++) {
            int X = A[i];
            if (X <= N) {
                int index = X - 1;
                counters[index] = Math.max(lastMaximumCounterValue, counters[index]);
                counters[index] += 1;
                maximumCounterValue = Math.max(counters[index], maximumCounterValue);

            } else {
                lastMaximumCounterValue = maximumCounterValue;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastMaximumCounterValue);
        }

        return counters;
    }
}

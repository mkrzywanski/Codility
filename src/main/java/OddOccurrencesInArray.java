public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int counter = 0;

            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    if (A[i] == A[j]) {
                        break;
                    }
                    counter++;
                }
            }
            if (counter == A.length - 1) {
                return A[i];
            }
        }
        return 0;
    }

    public static int solution2(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }

    public static int solution2(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        int distinctElementsAmount = 1;
        int currentElement = A[0];

        for (int i = 1; i < A.length; i++) {
            if (currentElement != A[i]) {
                distinctElementsAmount++;
                currentElement = A[i];
            }
        }

        return distinctElementsAmount;
    }
}

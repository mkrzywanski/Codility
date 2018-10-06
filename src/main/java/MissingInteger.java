import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        for (int i = 0; i < A.length; i++) {
            if (!set.contains(i + 1)) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}

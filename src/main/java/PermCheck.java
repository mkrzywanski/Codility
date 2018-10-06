import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static int solution(int A[]) {
        long arraySum = 0, permutationSum = 0;

        if (A.length == 1 && A[0] == 1) {
            return 1;
        }

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (hashSet.add(A[i])) {
                arraySum += A[i];
                permutationSum += i + 1;
            } else {
                return 0;
            }
        }


        if (arraySum == permutationSum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int solution2(int A[]) {
        boolean[] visited = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) return 0;

            if (visited[A[i]]) {
                return 0;
            } else {
                visited[A[i]] = true;
            }
        }

        return 1;
    }
}

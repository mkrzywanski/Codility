import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] tab = {10, 50, 5, 1};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] > 0 && A[i] > A[i + 2] - A[i + 1]) {
                return 1;
            }
        }
        return 0;
    }
}

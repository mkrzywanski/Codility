import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] array = {-5, 5, -5, 4};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int arrayLength = A.length;
        int firstValue = A[0] * A[1] * A[arrayLength - 1];
        int secondValue = A[arrayLength - 1] * A[arrayLength - 2] * A[arrayLength - 3];
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}

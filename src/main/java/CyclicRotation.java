import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int arrayLength = A.length;

        if (arrayLength == 0) {
            return A;
        }

        int trueRotationsAmount = K % arrayLength;
        int temporaryPreviousElement;
        int temporaryNextElement;

        for (int i = 0; i < trueRotationsAmount; i++) {
            temporaryPreviousElement = A[0];
            for (int j = 0; j < arrayLength; j++) {
                int newPosition = (j + 1) % arrayLength;
                temporaryNextElement = A[newPosition];
                A[newPosition] = temporaryPreviousElement;
                temporaryPreviousElement = temporaryNextElement;
            }
        }

        return A;
    }

    public static int[] solution2(int[] A, int K) {
        int arrayLength = A.length;

        if (arrayLength == 0) {
            return A;
        }

        int trueRotationsAmount = K % arrayLength;

        int[] newTab = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + trueRotationsAmount) % arrayLength;
            newTab[newIndex] = A[i];
        }

        return newTab;
    }

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        int[] tab2 = tab.clone();
        System.out.println(Arrays.toString(solution(tab,3)));
        System.out.println(Arrays.toString(solution2(tab2,3)));
    }
}

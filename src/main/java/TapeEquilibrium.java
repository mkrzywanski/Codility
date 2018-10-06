public class TapeEquilibrium {
    public static int solution(int A[]) {
        long sumLeft = A[0], sumRight = 0;

        for (int i = 1; i < A.length; i++) {
            sumRight += A[i];
        }
        int currentLowestDifference = (int) Math.abs(sumLeft - sumRight);

        if (A.length == 2) {
            return currentLowestDifference;
        }

        for (int l = 1; l < A.length - 1; l++) {
            sumLeft += A[l];
            sumRight -= A[l];

            int difference = (int) Math.abs(sumLeft - sumRight);

            if (difference < currentLowestDifference) {
                currentLowestDifference = difference;
            }
        }
        return currentLowestDifference;
    }
}

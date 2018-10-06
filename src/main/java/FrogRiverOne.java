public class FrogRiverOne {
    public static int solution(int X, int A[]) {
        boolean[] visited = new boolean[X];
        int alreadyVisitedCounter = 0;

        for (int i = 0; i < A.length; i++) {
            int currentValue = A[i];
            if (currentValue <= X) {
                int visitedArrayIndex = currentValue - 1;
                boolean isVisited = visited[visitedArrayIndex];
                if (!isVisited) {
                    visited[visitedArrayIndex] = true;
                    alreadyVisitedCounter++;
                }
            }
            if (alreadyVisitedCounter == X) {
                return i;
            }
        }
        return -1;
    }
}

public class EquiLeader {
    public static void main(String[] args) {
        int[] array = {4, 3, 4, 4, 4, 2};
        System.out.println(equiLeader(array));
    }

    public static int equiLeader(int[] A) {
        int size = 0;
        int value = 0;

        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            } else {
                if (A[i] == value) {
                    size++;
                } else {
                    size--;
                }
            }
        }

        int candidate = -1;
        if (size > 0) {
            candidate = value;
        }
        int candidateCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                candidateCount++;
            }
        }
        int leader;
        if (candidateCount > A.length / 2) {
            leader = candidate;
        } else {
            return 0;
        }

        int leftSideLeaderCount = 0;
        int equiLeaders = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leftSideLeaderCount++;
            }
            int rightSideLeaderCount = candidateCount - leftSideLeaderCount;
            if (leftSideLeaderCount > (i + 1) / 2 && rightSideLeaderCount > (A.length - 1 - i) / 2) {
                equiLeaders++;
            }
        }
        return equiLeaders;
    }
}

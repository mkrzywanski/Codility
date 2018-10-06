public class Dominator {
    public static void main(String[] args) {
        int[] tab = {3, 2, 3, 4, 3, 3, 3, -1};
        System.out.println(dominator(tab));
    }

    public static int dominator(int A[]) {
        int size = 0;
        int value = 0;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            } else {
                if (value == A[i]) {
                    size++;
                } else {
                    size--;
                }
            }
        }
        int candidate = -1;
        if(size > 0) {
            candidate = value;
        }
        int potentialDominatorCounter = 0;
        int lastPotentialDominatorIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                potentialDominatorCounter++;
                lastPotentialDominatorIndex = i;
            }
        }
        if (potentialDominatorCounter > A.length / 2) {
            return lastPotentialDominatorIndex;
        } else {
            return -1;
        }
    }
}

public class PermMissingElem {
    public static int solution(int[] A) {

        if (A.length == 0) {
            return 1;
        }

        if (A.length == 1 && A[0] == 2) {
            return 1;
        }

        if (A.length == 1 && A[0] == 1) {
            return 2;
        }

        long elementsSum = 0;
        long sequenceSum = 1;
        int currentSequenceNumber = 2;

        for (int i = 0; i < A.length; i++, currentSequenceNumber++) {
            elementsSum += A[i];
            sequenceSum = sequenceSum + currentSequenceNumber;
        }

        return (int) (sequenceSum - elementsSum);
    }
}

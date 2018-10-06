public class MaxSliceSum {
    public static int findSlice(int[] A) {
        int max_ending = 0, max_slice = A[0];
        for (int a : A) {
            max_ending = Math.max(a, max_ending + a);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }
}

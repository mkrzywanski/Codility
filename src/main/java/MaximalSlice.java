public class MaximalSlice {
    public static void main(String[] args) {
        int[] tab = {-11};
        System.out.println(findSlice(tab));
    }

    public static int findSlice(int[] A) {
        int max_ending = 0, max_slice = A[0];
        for (int a : A) {
            max_ending = Math.max(a, max_ending + a);
            max_slice = Math.max(max_slice, max_ending);
        }
        return max_slice;
    }

//    public static int findSlice(int[] A) {
//        if(A.length == 0) {
//            return 0;
//        }
//        int maxProfit = 0;
//        int minPrice = A[0];
//        for(int i = 1; i < A.length;i++) {
//            maxProfit = Math.max(maxProfit, A[i] - minPrice);
//            minPrice = Math.min(minPrice, A[i]);
//        }
//        return maxProfit;
//    }
}

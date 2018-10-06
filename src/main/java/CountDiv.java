public class CountDiv {
    // O(1)
    public static int solution(int A, int B, int K) {
        int remainder = A % K;

        if (remainder != 0) {
            A += K - remainder;
        }

        B -= B % K;

        if (A > B)
            return 0;
        else
            return (B - A) / K + 1;

    }

    // O((B-A)/K)
    public static int solution2(int A, int B, int K) {
        int counter = 0;
        long num = A;
        while (true) {
            if (num % K == 0) {
                break;
            }
            num++;
        }

        while (num <= B) {
            counter++;
            num += K;
        }
        return counter;
    }


}

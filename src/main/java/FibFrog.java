import java.util.Arrays;
import java.util.LinkedList;

public class FibFrog {

    public static void main(String[] args) {
        int[] tab = {0,0,0,1,1,0,1,0,0,0,0};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A) {
        if(A.length == 0) {
            return 1;
        }
        int arrayLength = A.length;
        int[] fibonacciArray = generateFibNumbersToNumberLessThan(arrayLength);
        int frogPositionIndex = -1;
        int endIndex = arrayLength;
        int fibArrayIndex = fibonacciArray.length - 1;
        int jumps = 0;


        while (frogPositionIndex <= endIndex) {
            int jumpLength = fibonacciArray[fibArrayIndex];
            int index = frogPositionIndex + jumpLength;
            if(index == endIndex) {
                jumps++;
                break;
            }
            if(A[index] == 1) {
                frogPositionIndex = index;
                jumps++;
                fibonacciArray = generateFibNumbersToNumberLessThan(endIndex - frogPositionIndex);
                fibArrayIndex = fibonacciArray.length - 1;
                continue;
            } else {
                fibArrayIndex--;
            }
        }

        System.out.println(Arrays.toString(fibonacciArray));
        return jumps;
    }

    public static int[] generateFibNumbersToNumberLessThan(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (n == 0) {
            return new int[]{0};
        }

        if (n == 1) {
            return new int[]{0};
        }

        int a1 = 0, a2 = 1;

        //linkedList.add(a1);
        //linkedList.add(a2);
        int[] tab = new int[n + 1];
        tab[0] = 0;
        tab[1] = 1;

        int a3 = 0;
        do {
            a3 = a2 + a1;
            if (a3 > n) {
                break;
            }
            linkedList.add(a3);
            a1 = a2;
            a2 = a3;
        } while (true);

        int[] res = new int[linkedList.size()];
        int index = 0;
        for (Integer i : linkedList) {
            res[index] = i;
            index++;
        }

        return res;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(solution(A, B));
    }

    public static int solution(int A[], int[] B) {
        Stack<Integer> fishSwimmingUpStack = new Stack<>();
        int fishAlive = 0;
        for (int i = 0; i < A.length; i++) {
            int direction = B[i];
            int fishSize = A[i];

            if (direction == 1) {
                fishSwimmingUpStack.push(fishSize);
            } else {
                fishAlive++;
                while (fishSwimmingUpStack.size() > 0) {
                    int fishSwimmingUpSize = fishSwimmingUpStack.peek();
                    if (fishSwimmingUpSize > fishSize) {
                        fishAlive--;
                        break;
                    } else {
                        fishSwimmingUpStack.pop();
                    }
                }
            }
        }
        fishAlive = fishAlive + fishSwimmingUpStack.size();
        return fishAlive;
    }
}

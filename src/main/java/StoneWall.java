import java.util.Stack;

public class StoneWall {
    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int blocksAmount = 0;

        for (int i = 0; i < H.length; i++) {
            int currentTowerHeight = H[i];

            while (stack.size() > 0 && currentTowerHeight < stack.peek()) {
                stack.pop();
            }

            if (stack.size() == 0 || stack.peek() != currentTowerHeight) {
                blocksAmount++;
                stack.push(currentTowerHeight);
            }
        }
        return blocksAmount;
    }
}

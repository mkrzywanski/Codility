import java.util.Stack;

public class Nesting {
    public static int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return 0;
                }
                stack.pop();
            }
        }

        if (stack.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        String s = "()(()()(((()())(()()))";
        System.out.println(solution(s));
    }
}

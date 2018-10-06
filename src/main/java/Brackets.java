import java.util.HashMap;
import java.util.LinkedHashSet
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String s = "(({()})))"; HashMap
        System.out.println(solution(s));
    }


    public static int solution(String S) {
        if (S.length() == 0) {
            return 1;
        }

        Stack<Character> stack = new Stack<>();

        char leftParentheses = '(';
        char leftBracket = '[';
        char leftBraces = '{';

        Map<Character, Character> map = new HashMap<>();
        map.put(leftParentheses, ')');
        map.put(leftBracket, ']');
        map.put(leftBraces, '}');

        for (int i = 0; i < S.length(); i++) {
            char currentSign = S.charAt(i);
            if (currentSign == leftBraces || currentSign == leftBracket || currentSign == leftParentheses) {
                stack.push(currentSign);
            } else {
                if (stack.size() == 0) {
                    return 0;
                }
                char sign = stack.pop();
                char rightSign = map.get(sign);
                if (rightSign != currentSign) {
                    return 0;
                }
            }
        }

        if (stack.size() != 0) {
            return 0;
        } else {
            return 1;
        }
    }


}

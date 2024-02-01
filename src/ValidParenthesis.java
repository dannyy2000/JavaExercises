import java.util.Objects;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

       Stack<Character> stack = new Stack<>();

//        String wordss = "";
//        for (char ch : s.toCharArray()) {
//            if (ch == '(' || ch == '{' || ch == '[') {
//                String word = String.valueOf(ch);
//
//                String[] words = new String[]{word};
//            } else {
////                if ((ch == ')' || ch == '}' || ch == ']')) {
////                    String word = String.valueOf(ch);
////
////                    String[] words2 = new String[]{word};
////                }
//                 wordss = String.valueOf(ch);
//
//
//                if ((ch == '(' && !Objects.equals(wordss, ")")) || (ch == '{' && !Objects.equals(wordss, "}")) || (ch == '[' && !Objects.equals(wordss, "]"))) {
//                    return false;
//                }
//            }
//
//        }






//    return true;

        for(char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
//       } else if (stack.empty()) {
//                return false;
//            }
            } else {
                if (stack.empty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
       }

        return stack.empty();

}






    public static void main(String[] args) {
        String word = "(}";
        System.out.println(isValid(word));

    }
}

public class Evaluator {

    public static int evaluate(String postfix, Stack<Integer> stack) {

        String[] tokens = postfix.split(" ");

        for (String t : tokens) {

            if (t.equals(""))
                continue;

            if (Character.isDigit(t.charAt(0))) {
                stack.push(Integer.parseInt(t));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (t.charAt(0)) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
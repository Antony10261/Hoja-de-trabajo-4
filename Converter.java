// package Hojas de trabajo.HDT 4;
public class Converter {

    public static String infixToPostfix(String exp, Stack<Character> stack) {
        String resultado = "";

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
                //corregido
            if (Character.isDigit(c)) {
    String numero = "";

    while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
        numero += exp.charAt(i);
        i++;
    }

    i--; // retrocede porque el for incrementa
    resultado += numero + " ";
}else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    resultado += stack.pop() + " ";
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && prioridad(c) <= prioridad(stack.peek())) {
                    resultado += stack.pop() + " ";
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            resultado += stack.pop() + " ";
        }

        return resultado;
    }

    private static int prioridad(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        return -1;
    }
}
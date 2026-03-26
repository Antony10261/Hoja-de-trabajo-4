// package Hojas de trabajo.HDT 4;

public class Main {
    public static void main(String[] args) {

        Stack<Character> stack = new ArrayListStack<>();

        String infix = "(10+20)*9";

        String postfix = Converter.infixToPostfix(infix, stack);

        System.out.println("Postfix: " + postfix);
    }
}
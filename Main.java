package Hojas de trabajo.HDT 4;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);

        System.out.println(stack.pop()); // debería imprimir 20
    }
}
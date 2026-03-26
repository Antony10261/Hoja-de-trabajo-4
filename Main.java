// package Hojas de trabajo.HDT 4;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione implementacion de stack:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");

        int opcion = sc.nextInt();

        Stack<Character> stack1;

        if (opcion == 2) {
            stack1 = new VectorStack<>();
        } else {
            stack1 = new ArrayListStack<>();
        }

        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        String infix = br.readLine();

        String postfix = Converter.infixToPostfix(infix, stack1);
        System.out.println("Postfix: " + postfix);

        Stack<Integer> stack2;

        if (opcion == 2) {
            stack2 = new VectorStack<>();
        } else {
            stack2 = new ArrayListStack<>();
        }

        int resultado = Evaluator.evaluate(postfix, stack2);

        System.out.println("Resultado: " + resultado);
    }
}
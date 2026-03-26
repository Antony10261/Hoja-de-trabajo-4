package Hojas de trabajo.HDT 4;

public class Main {
    public static void main(String[] args) {

        SimpleList<Integer> lista = new SimpleList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println(lista.removeLast()); // 30
        System.out.println(lista.getLast());    // 20
    }
}
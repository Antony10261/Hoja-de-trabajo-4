// package Hojas de trabajo.HDT 4;
public class SimpleList<T> implements ListADT<T> {

    private Node<T> head;

    public void add(T value) {
        Node<T> nuevo = new Node<>(value);

        if (head == null) {
            head = nuevo;
        } else {
            Node<T> temp = head;
            while (temp.next != null) { // quitar
                temp = temp.next;
            }
            temp.next = nuevo;
        }
    }

    public T removeLast() {
        if (head == null)
            return null;

        if (head.next == null) {
            T val = head.value;
            head = null;
            return val;
        }

        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        T val = temp.next.value;
        temp.next = null;
        return val;
    }
//
    public T getLast() {
        if (head == null)
            return null;

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
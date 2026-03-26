// package Hojas de trabajo.HDT 4;
import java.util.ArrayList;

public class ArrayListStack<T> extends AbstractStack<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void push(T value) {
        data.add(value);
        size++;
    }

    public T pop() {
        if (isEmpty())
            return null;
        size--;
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if (isEmpty())
            return null;
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
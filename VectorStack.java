import java.util.Vector;

public class VectorStack<T> extends AbstractStack<T> {

    private Vector<T> data = new Vector<>();

    public void push(T value) {
        data.add(value);
        size++;
    }

    public T pop() { // corejir el pop
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
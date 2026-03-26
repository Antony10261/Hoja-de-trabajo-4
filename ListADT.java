// package Hojas de trabajo.HDT 4;
public interface ListADT<T> {
    void add(T value);

    T removeLast();

    T getLast();

    boolean isEmpty();
} //modificar
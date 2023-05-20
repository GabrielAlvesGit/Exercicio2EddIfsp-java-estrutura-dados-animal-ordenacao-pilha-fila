package br.edu.ifsp.spo.edd2.list;

import java.util.ArrayList;
import java.util.List;

public interface Fila<E> {
    void enqueue(E element);

    E dequeue();

    E peek();

    int size();

    boolean isEmpty();
}

class FilaLista<E> implements Fila<E> {
    private List<E> lista;

    public FilaLista() {
        lista = new ArrayList<>();
    }

    @Override
    public void enqueue(E element) {
        lista.add(element);
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return lista.remove(0);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return lista.get(0);
    }

    @Override
    public int size() {
        return lista.size();
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
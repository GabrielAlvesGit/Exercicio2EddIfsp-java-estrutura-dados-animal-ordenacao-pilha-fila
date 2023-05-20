package br.edu.ifsp.spo.edd2.list;

import java.util.List;
import java.util.ArrayList;

public interface Pilha<T> {
    void push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}

class PilhaLista<T> implements Pilha<T> {
    private List<T> lista;

    public PilhaLista() {
        lista = new ArrayList<>();
    }

    @Override
    public void push(T elemento) {
        lista.add(elemento);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return lista.remove(size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return lista.get(size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public int size() {
        return lista.size();
    }
}


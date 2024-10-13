package org.example.Ej1;

import java.util.LinkedList;
import java.util.List;

public class Pila<T> {
    private List<T> pila = new LinkedList<>();

    public void añadir(T elemento) {
        pila.add(elemento);
    }

    public T extraer() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.remove(pila.size() - 1);
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public T primero() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.get(pila.size() - 1);
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}

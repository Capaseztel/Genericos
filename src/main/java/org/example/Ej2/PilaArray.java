package org.example.Ej2;

import java.util.Arrays;

public class PilaArray<T> {
    private T[] pila = (T[]) new Object[0];
    private int objetosInsertados = 0;

    public void añadir(T elemento) {
        objetosInsertados++;
        T[] nuevaPila = Arrays.copyOf(pila, pila.length + 1);
        nuevaPila[nuevaPila.length - 1] = elemento;
        pila = nuevaPila;
    }

    public T extraer() {
        if (pila.length == 0) {
            return null;
        }
        T[] nuevaPila = Arrays.copyOf(pila, pila.length - 1);
        T elemento = pila[pila.length - 1];
        pila = nuevaPila;
        return elemento;
    }

    public boolean estaVacia() {
        return pila.length == 0;
    }

    public T primero() {
        if (this.estaVacia()) {
            return null;
        }
        return pila[pila.length - 1];
    }

    public int getObjetosInsertados() {
        return objetosInsertados;
    }

    @Override
    public String toString() {
        return Arrays.toString(pila);
    }
}

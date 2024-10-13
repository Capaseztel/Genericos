package org.example.Ej6;

import java.util.Arrays;

public class ListaOrdenada<E extends Comparable<E>> {
    private E[] lista;

    public ListaOrdenada() {
        lista = (E[]) new Comparable[0];
    }

    public void add(E Elemento) {
        E[] nuevaLista = Arrays.copyOf(lista, lista.length + 1);
        nuevaLista[nuevaLista.length - 1] = Elemento;
        lista = nuevaLista;
    }

    public E get(int index) {
        return lista[index];
    }

    public int size() {
        return lista.length;
    }

    public boolean isEmpty() {
        return lista.length == 0;
    }

    public boolean remove(E Elemento) {
        if (isEmpty()) {
            return false;
        } else {
            E[] nuevaLista = (E[]) new Comparable[lista.length - 1];
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].compareTo(Elemento) != 0) {
                    nuevaLista[j] = lista[i];
                    j++;
                }
            }
            lista = nuevaLista;
        }
        return true;
    }

    public int indexOf(E Elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].compareTo(Elemento) == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }
}

package org.example.Ej4;

import org.example.Ej3.Matriz;

public class Main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(4, 2);
        matriz.setElemento(0, 0, 1);
        matriz.setElemento(0, 1, 2);
        matriz.setElemento(1, 0, 3);
        matriz.setElemento(1, 1, 4);
        matriz.setElemento(2, 0, 5);
        matriz.setElemento(2, 1, 6);
        matriz.setElemento(3, 0, 7);
        matriz.setElemento(3, 1, 8);
        System.out.println(matriz);
        System.out.println(matriz.getElemento(0,1));
    }
}

package org.example.Ej3;

public class Main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(3, 3);
        matriz.setElemento(0, 0, 1);
        matriz.setElemento(0, 1, 2);
        matriz.setElemento(0, 2, 3);
        matriz.setElemento(1, 0, 4);
        matriz.setElemento(1, 1, 5);
        matriz.setElemento(1, 2, 6);
        matriz.setElemento(2, 0, 7);
        matriz.setElemento(2, 1, 8);
        matriz.setElemento(2, 2, 9);
        System.out.println(matriz.columnas());
        System.out.println(matriz.filas());
        System.out.println(matriz);
    }
}

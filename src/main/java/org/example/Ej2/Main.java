package org.example.Ej2;

public class Main {
    public static void main(String[] args) {
        PilaArray<Integer> pila = new PilaArray<>();
        pila.añadir(1);
        pila.añadir(2);
        pila.añadir(3);
        pila.añadir(4);
        pila.añadir(5);
        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila);
        System.out.println(pila.primero());
        System.out.println(pila.getObjetosInsertados());

    }
}
package org.example.Ej1;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.añadir(1);
        pila.añadir(13);
        pila.añadir(6);
        pila.añadir(7);
        pila.añadir(9);
        System.out.println(pila.extraer());
        System.out.println(pila.extraer());
        System.out.println(pila.estaVacia());
        System.out.println(pila.primero());
        System.out.println(pila);
    }
}
package org.example.Ej6;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista);
        System.out.println(lista.get(2));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.remove(3));
        System.out.println(lista);
        System.out.println(lista.indexOf(5));
    }
}

package org.example.Ej5;

public interface ColeccionSimpleGenerica<T> {
    boolean estaVacia();
    T extraer();
    T primero();
    void añadir(T elemento);
}

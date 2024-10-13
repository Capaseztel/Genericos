package org.example.Ej3;

public class Matriz<T> {
    private T[][] matriz;

    public Matriz(int filas, int columnas) {
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    public void setElemento(int fila, int columna, T elemento) {
        this.matriz[fila][columna] = elemento;
    }

    public T getElemento(int fila, int columna) {
        return this.matriz[fila][columna];
    }

    public int columnas() {
        return this.matriz[0].length;
    }

    public int filas() {
        return this.matriz.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.filas(); i++) {
            for (int j = 0; j < this.columnas(); j++) {
                sb.append(this.getElemento(i, j));
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
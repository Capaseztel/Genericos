class Operable implements org.example.Ej7.IOperable<Integer> {
    int valor;

    public Operable(int valor) {
        this.valor = valor;
    }

    @Override
    public Integer sumar(Integer integer) {
        return valor + integer;
    }

    @Override
    public Integer restar(Integer integer) {
        return valor - integer;
    }

    @Override
    public Integer multiplicar(Integer integer) {
        return valor * integer;
    }

    @Override
    public Integer dividir(Integer integer) {
        return valor / integer;
    }
}

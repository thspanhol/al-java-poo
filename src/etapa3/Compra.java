package etapa3;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + " - " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        // O tipo primitivo double não tem o metodo compareTo, por isso o uso da Wrapper Class
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}

package etapa3;

import java.util.List;

public class CartaoDeCredito {
    private double saldo;
    private List<String> comprasFeitas;

    public void addCompra(String compra) {
        comprasFeitas.add(compra);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<String> getComprasFeitas() {
        return comprasFeitas;
    }

    public void setComprasFeitas(List<String> comprasFeitas) {
        this.comprasFeitas = comprasFeitas;
    }
}

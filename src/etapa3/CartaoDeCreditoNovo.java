package etapa3;

import java.util.List;

public class CartaoDeCreditoNovo{
    private double saldo;
    private List<Compra> comprasFeitas;


    public void addCompra(Compra compra) {
        comprasFeitas.add(compra);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Compra> getComprasFeitas() {
        return comprasFeitas;
    }

    public void setComprasFeitas(List<Compra> comprasFeitas) {
        this.comprasFeitas = comprasFeitas;
    }

}

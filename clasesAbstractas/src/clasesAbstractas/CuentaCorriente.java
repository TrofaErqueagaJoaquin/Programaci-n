package clasesAbstractas;

public class CuentaCorriente extends CuentaBancaria {
    private double topeDescubierto;

    public CuentaCorriente(String titular, double topeDescubierto) {
        super(titular);
        this.topeDescubierto = topeDescubierto;
    }

    public void setTopeDescubierto(double nuevoTope) {
        this.topeDescubierto = nuevoTope;
    }

    @Override
    public boolean extraer(double monto) {
        if (saldo - monto >= -topeDescubierto) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}

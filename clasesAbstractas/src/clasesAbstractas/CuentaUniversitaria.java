package clasesAbstractas;

public class CuentaUniversitaria extends CuentaBancaria {

    public CuentaUniversitaria(String titular) {
        super(titular);
    }

    @Override
    public boolean extraer(double monto) {
        if (monto <= 1000 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
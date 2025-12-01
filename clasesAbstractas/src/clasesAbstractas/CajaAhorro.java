package clasesAbstractas;

public class CajaAhorro extends CuentaBancaria {
    private static final int MAX_EXTRACCIONES_MENSUALES = 5;
    private int extraccionesRealizadas;

    public CajaAhorro(String titular) {
        super(titular);
        this.extraccionesRealizadas = 0;
    }

    @Override
    public boolean extraer(double monto) {
        if (extraccionesRealizadas < MAX_EXTRACCIONES_MENSUALES && saldo >= monto) {
            saldo -= monto;
            extraccionesRealizadas++;
            return true;
        }
        return false;
    }

    public void reiniciarExtraccionesMensuales() {
        extraccionesRealizadas = 0;
    }
}

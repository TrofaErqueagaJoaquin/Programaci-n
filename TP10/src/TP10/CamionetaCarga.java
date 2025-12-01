package clase10;

public class CamionetaCarga extends VehiculoCarga {
    public CamionetaCarga(String patente, double pma) {
        super(patente, pma);
    }

    @Override
    public double calcularPrecio(int dias) {
        double incremento = precioBasediario * (0.20 * pma);
        return (precioBasediario + incremento) * dias;
    }
}

package clase10;

public class Auto extends VehiculoPasajeros {
    public Auto(String patente, int plazas) {
        super(patente, plazas);
    }

    @Override
    public double calcularPrecio(int dias) {
        double incremento = precioBasediario * (1.5 / 100) * plazas;
        return (precioBasediario + incremento) * dias;
    }
}
package clase10;

public class Combi extends VehiculoPasajeros {
    public Combi(String patente, int plazas) {
        super(patente, plazas);
    }

    @Override
    public double calcularPrecio(int dias) {
        double precioAuto = new Auto(patente, plazas).calcularPrecio(dias);
        double extra = precioBasediario * (2 / 100.0) * plazas; // extra fijo
        return precioAuto + extra;
    }
}

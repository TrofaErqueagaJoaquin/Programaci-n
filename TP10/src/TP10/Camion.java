package clase10;

public class Camion extends VehiculoCarga {
    private Trailer trailer;

    public Camion(String patente, double pma, Trailer trailer) {
        super(patente, pma);
        this.trailer = trailer;
    }

    @Override
    public double calcularPrecio(int dias) {
        double incremento = precioBasediario * (0.20 * pma);
        double precioBaseCarga = (precioBasediario + incremento) * dias;
        double extraCamion = precioBaseCarga * 0.40; // 40% fijo
        double precioTotal = precioBaseCarga + extraCamion;

        if (trailer != null) {
            precioTotal += trailer.getCostoDiario() * dias;
        }
        return precioTotal;
    }
}

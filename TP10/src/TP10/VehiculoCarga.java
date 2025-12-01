package clase10;

public abstract class VehiculoCarga extends Vehiculo {
    protected double pma; // Peso Máximo Autorizado en toneladas

    public VehiculoCarga(String patente, double pma) {
        super(patente);
        this.pma = pma;
    }
}

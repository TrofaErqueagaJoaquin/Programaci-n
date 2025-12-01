package clase10;

public abstract class VehiculoPasajeros extends Vehiculo {
    protected int plazas;

    public VehiculoPasajeros(String patente, int plazas) {
        super(patente);
        this.plazas = plazas;
    }
}
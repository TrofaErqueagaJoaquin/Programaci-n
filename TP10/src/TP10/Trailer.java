package clase10;

public abstract class Trailer {
    protected double costoDiario;

    public Trailer(double costoDiario) {
        this.costoDiario = costoDiario;
    }

    public double getCostoDiario() {
        return costoDiario;
    }
}

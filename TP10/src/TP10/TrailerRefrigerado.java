package clase10;

public class TrailerRefrigerado extends Trailer {
    private double temperaturaMinima;

    public TrailerRefrigerado(double costoDiario, double temperaturaMinima) {
        super(costoDiario);
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
}

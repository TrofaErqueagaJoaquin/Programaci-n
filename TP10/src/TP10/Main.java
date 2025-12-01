package clase10;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("ABC123", 4);
        Vehiculo combi = new Combi("XYZ789", 12);
        Vehiculo camioneta = new CamionetaCarga("TTT111", 1.5);
        Vehiculo camion = new Camion("CAM456", 3, new TrailerRefrigerado(200, -5));

        System.out.println("Auto (5 días): $" + auto.calcularPrecio(5));
        System.out.println("Combi (3 días): $" + combi.calcularPrecio(3));
        System.out.println("Camioneta de carga (4 días): $" + camioneta.calcularPrecio(4));
        System.out.println("Camión con trailer refrigerado (2 días): $" + camion.calcularPrecio(2));
    }
}

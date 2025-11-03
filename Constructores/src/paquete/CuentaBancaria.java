package paquete;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int cantidadDepositos;
    private int cantidadExtracciones;

    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantidadDepositos() {
        return cantidadDepositos;
    }

    public int getCantidadExtracciones() {
        return cantidadExtracciones;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            cantidadDepositos++;
        }
    }

    public boolean extraer(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            cantidadExtracciones++;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Titular: " + titular +
               ", Saldo: $" + saldo +
               ", Depósitos: " + cantidadDepositos +
               ", Extracciones: " + cantidadExtracciones;
    }
}

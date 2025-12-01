package clasesAbstractas;

public abstract class CuentaBancaria {
	    protected String titular;
	    protected double saldo;

	    public CuentaBancaria(String titular) {
	        this.titular = titular;
	        this.saldo = 0;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void depositar(double monto) {
	        if (monto > 0) {
	            saldo += monto;
	        }
	    }

	    public abstract boolean extraer(double monto); 
	}



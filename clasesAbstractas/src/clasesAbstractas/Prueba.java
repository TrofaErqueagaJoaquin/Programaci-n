package clasesAbstractas;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1= new CuentaCorriente("Agus",500);
		CuentaBancaria cuenta2= new CajaAhorro("Anto");
		CuentaBancaria cuenta3= new CuentaUniversitaria("Juan");
		
		cuenta1.depositar(200);
		cuenta2.depositar(500);
		cuenta3.depositar(1000);
		
		System.out.println("Extraccion cuenta corriente(1100)"+ cuenta1.extraer(1100));
		System.out.println("Extraccion cuenta corriente(100)"+ cuenta2.extraer(100));
		System.out.println("Extraccion cuenta corriente(1900)"+ cuenta3.extraer(1900));
		
		System.out.println("Saldo en cuenta"+ cuenta1.getSaldo());
		System.out.println("Saldo en cuenta"+ cuenta2.getSaldo());
		System.out.println("Saldo en cuenta"+ cuenta3.getSaldo());
	}

}

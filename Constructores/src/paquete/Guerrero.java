package paquete;

public class Guerrero {
	private String Nombre;
	private double vitalidad;
	private double armadura;
	private double x;
	private double y;
	
	public Guerrero(String Nombre) {
        this.Nombre = Nombre;
        this.vitalidad = 500;
        this.armadura = 800;
    }

    public Guerrero(String Nombre, double x, double y) {
        this(Nombre);
        this.x = x;
        this.y = y;
    }
	
	public String getNombre() {
		return Nombre;
	}
	public double getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(double vitalidad) {
		this.vitalidad = vitalidad;
	}
	public double getArmadura() {
		return armadura;
	}
	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	    public void mover(double inc_x, double inc_y) {
	        this.x += inc_x;
	        this.y += inc_y;
	    }

	    public void recibeDano(double cantidad) {
	        if (cantidad <= 0) return;
	        if (armadura >= cantidad) {
	            armadura -= cantidad;
	        } else {
	            double danoRestante = cantidad - armadura;
	            armadura = 0;
	            vitalidad -= danoRestante;
	            if (vitalidad < 0) vitalidad = 0;
	        }
	    }

}

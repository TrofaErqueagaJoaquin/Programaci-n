package paquete;

public class Persona {
	private String Nombre;
	private int Edad;
	private String Mail;
	
	public Persona(String Nombre,int Edad,String Mail) {
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Mail=Mail;
	}
	public Persona(String Nombre,int Edad) {
		this.Nombre=Nombre;
		this.Edad=Edad;
	}
	
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getNombre() {
		return Nombre;
	}
	public boolean sosMayor() {
		if (this.Edad >18)
			return true;
		else
			return false;
	}
	public int repeticionesDeLetra(char letra) {
        int contador = 0;
        for (int i = 0; i < Nombre.length(); i++) {
            if (Character.toLowerCase(Nombre.charAt(i)) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        return contador;
    }
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + ", Mail=" + Mail + ", getEdad()=" + getEdad()
				+ ", getMail()=" + getMail() + ", getNombre()=" + getNombre() + ", sosMayor()=" + sosMayor() + "]";
	}
	
}

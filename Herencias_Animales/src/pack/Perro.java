package pack;

public class Perro extends Animales {

	private String raza;

	public Perro(Sexo s, String raza) {
		super(s);
		this.raza = raza;
	}

	public Perro(String raza) {
		this.raza = raza;
	}

	public void ladrar() {
		System.out.println("Guau, guau!");
	}

	public void jugar() {
		System.out.println(" ¿Donde está elhueso?.");
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + "]";
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}

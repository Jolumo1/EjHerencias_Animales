package pack;

public class Gato extends Animales implements Mascota{

	private String raza;
	private String codigo;
	
	
	@Override
	public String getCodigo() {
		return codigo;
	}

	public Gato(Sexo s, String raza) {
		super(s);
		this.raza = raza;
	}
	
	
	
	public Gato(String raza) {
		this.raza = raza;
	}

	@Override
	public void hazRuido() {
		maullar();
		ronronea();
	}
	
		
	public void maullar() {
		System.out.println("Miauuuu");
	}

	public void ronronea() {
		System.out.println("Mrrrrrr");
	}
	
	@Override
	public void comer(String comida) {
		if (comida.equals("pescado")){
			System.out.println("Que rico");
		}else {
			System.out.println("No me gusta");
		}
	}
	
	@Override
	public void pelear(Gato gato1) {
		if(this.getSexo() == gato1.getSexo()) {
			System.out.println("Vamos a peliar wey");
					
		}else {
			System.out.println("No puedo pelearme, tengo fútbol");
		}
	}

	@Override
	
	//al añadirle el super.tostring añadimos el toString de la clase padre
	public String toString() {
		return super.toString() + "Gato [raza=" + raza + "]";
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}

package pack;

//el abstract te impide crear objetos animal, solo te dejará crear objetos heredados de esta clase
public abstract class Animales {

	private Sexo sexo;

	public enum Sexo {
		MACHO, HEMBRA, HERMAFRODITA

	}

	
	public void dormir() {
		System.out.println("zzzzzzzzzzzzzzzzzzzzzz");
	}
	
	// Constructores
	public Animales(Sexo s) {
		this.sexo = s;

	}

	
	public Animales() {
		sexo=Sexo.MACHO;
	}


	
	
	//getters and Setters
	@Override
	public String toString() {
		return "Animales [sexo=" + sexo + "]";
		
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



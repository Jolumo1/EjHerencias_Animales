package pack;

public class Pinguino extends Ave{

	public Pinguino(Sexo s) {
		super(s);
	}

	Pinguino(){
		
	}
	
	
	
	// el override sobreescribe el metodo volar que ya estaba en la clase padre Ave y cambia el comportamiento
	@Override
	public void volar() {
		System.out.println("Yo no se volar");
	}
	
	
	
	
}

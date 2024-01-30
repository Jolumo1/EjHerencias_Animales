package pack;

public interface Mascota {

	String getCodigo();
	
	void hazRuido();
	void comer(String comida);
	void pelear(Gato contrincante);
	
}

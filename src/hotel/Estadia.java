package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	Estadia(String nome, String tipo, int idade, double valor){
		this.animal = Animal a(nome, tipo, idade);
		this.valor = valor;
	}
	
	public int getDias() {
		return dias;
	}
	
	
}

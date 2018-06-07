package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	Estadia(String nome, String tipo, int idade, double valor){
		
		Animal animal = new Animal(nome, tipo,idade);
		this.animal = animal;
		this.valor = valor;
	}
	
	public int getDias() {
		return dias;
	}
	
	
}

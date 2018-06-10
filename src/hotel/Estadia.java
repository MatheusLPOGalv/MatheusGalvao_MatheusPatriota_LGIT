package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	private String nome;
	private String tipo;
	private int idade;
	
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor){
		
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
		this.idade = idade;
		this.nome = nome;
		
	}
	
	public int getDias() {
		
		return dias;
	}
	
	public double getValor() {
		
		return valor;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public int getIdade() {
		
		return idade;
	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	@Override
	public String toString() {
		
		return nome + " ("  + tipo + "):" + dias + " dias com  o preço de R$ " + valor;
	}
	
	
}

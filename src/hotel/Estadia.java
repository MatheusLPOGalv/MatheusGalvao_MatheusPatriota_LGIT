package hotel;

import java.util.ArrayList;

public class Estadia {
	
	private Animal animal;
	private ArrayList<Animal> listaDeAnimais = new ArrayList<>();
	private double valor;
	private int dias;
	private String nome;
	private String tipo;
	private int idade;
	
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor){
		
		this.animal = new Animal(nome, tipo, idade);
		this.listaDeAnimais.add(animal);
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
	
	public ArrayList<Animal> getListaDeAnimais() {
		return listaDeAnimais;
	}
	
	public void setListaDeAnimais(ArrayList<Animal> listaDeAnimais) {
		this.listaDeAnimais = listaDeAnimais;
	}
	
	@Override
	public String toString() {
		
		return nome + " ("  + tipo + "):" + dias + " dias com  o preço de R$ " + valor;
	}
	
	
}

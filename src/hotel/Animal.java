package hotel;

public class Animal {
	
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		
	}
	

	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (idade != other.idade)
			return false;
		return true;
	}
}

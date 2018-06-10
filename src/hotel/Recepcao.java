package hotel;


import java.util.HashMap;

public class Recepcao {

	private HashMap<String, Estadia> estadias= new HashMap<>();
	private Estadia teste;
	private Estadia adicionaEstadiaDeHospede;
	private int numDeHospedes = 0;
	private int lucroTotal = 0;
	
	public Recepcao() {
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		
		this.numDeHospedes += 1;
		this.lucroTotal += valor;
		adicionaEstadiaDeHospede = new Estadia(nome, tipo, idade, dias, valor);
		this.estadias.put(nome, adicionaEstadiaDeHospede);
	
	}
	
	public void checkOut(String nome) {
			
		this.estadias.remove(nome);
		this.numDeHospedes -= 1;

	}
	
	public int getNumDeHospedes() {
		
		return numDeHospedes;
	}
	
	public int getLucroTotal() {
		
		return lucroTotal;
	}
	
	@Override
	public String toString() {
		
		String exibeListasDeHospedes = "";
		
		for (int i = 0; i < teste.getListaDeAnimais().size(); i++) {
			
			exibeListasDeHospedes += teste.getListaDeAnimais().toString() + System.lineSeparator();
		}
		
		return exibeListasDeHospedes;
	}
	
	
}

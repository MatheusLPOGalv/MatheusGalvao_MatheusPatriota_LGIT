package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList<Estadia> estadias = new ArrayList<>();
	private Estadia adicionaEstadiaAoArray;
	private int numDeHospedes = 0;
	private int lucroTotal = 0;
	
	public Recepcao() {
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		
		this.numDeHospedes += 1;
		this.lucroTotal += valor;
		adicionaEstadiaAoArray = new Estadia(nome, tipo, idade, dias, valor);
		this.estadias.add(adicionaEstadiaAoArray);
		
	}
	
	public void checkOut(String nome) {
		
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
		for (int i = 0; i < estadias.size(); i++) {
			
			exibeListasDeHospedes += estadias.get(i) + System.lineSeparator();
		}
		
		return exibeListasDeHospedes;
	}
	
	
}

package hotel;

public class Hotel {
	
	private Recepcao recepcao = new Recepcao();
	private int numDeHospedes = 0;
	private double lucroTotal = 0;
	
	
	
	public Hotel() {
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		
		this.recepcao.checkIn(nome, tipo, idade, dias, valor);
		
	}
	
	public void checkOut(String nome) {
		
		recepcao.checkOut(nome);

	}
	
	public int getNumDeHospedes() {
		
		return numDeHospedes;
	}
	
	public double getLucroTotal() {
		
		return lucroTotal;
	}
	
	@Override
	public String toString() {
		
		return recepcao.toString();
	}
	
	
	
}

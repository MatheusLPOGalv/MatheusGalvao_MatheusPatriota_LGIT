package hotel;

import java.util.Scanner;

public class UserInterface {
	
	private static Hotel operacoesHotel = new Hotel();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcao;
		
		
		do {
			
			System.out.println("(C)heckIn");
			System.out.println("(R)CheckOut");
			System.out.println("(L)istar Hospedes");
			System.out.println("(S)air");
			System.out.print("Opção> ");
			opcao = sc.nextLine();
			System.out.println();
			
			switch (opcao) {
			
			case "S":
				
				break;
				
			case "C":
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Tipo de animal: ");
				String tipo = sc.nextLine();
				System.out.print("idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.print("Dias: ");
				int dias = sc.nextInt();
				sc.nextLine();
				System.out.print("Valor: ");
				double valor = sc.nextDouble();
				sc.nextLine();
				operacoesHotel.checkIn(nome, tipo, idade, dias, valor);
				System.out.println();
				break;
			
			case "R":
				
				System.out.print("Nome: ");
				nome = sc.nextLine();
				operacoesHotel.checkOut(nome);
				break;
				
			case "L":
				
				System.out.println("Estadias: ");
				operacoesHotel.toString();
				break;
				
			default:
				
				System.out.println("Opção invalida!");
				break;
			}
			
		} while (!opcao.equals("S"));
		
		
		
		sc.close();
		
		
	}
}

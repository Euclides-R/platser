package apresentacao.principal;

import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	public String processar__banco(String nome, int rg, int cpf, String email, String Senha) {
		int v = 0;
		do {
			System.out.println("Para solicitar seu serviço faça seu login ou se cadastre gratuitamente:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Login");
			v = input.nextInt();
			switch (v) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			}
		} while (v == 0);
		return null;
	}
}

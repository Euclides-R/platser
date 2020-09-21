package perfil_user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Informacoes_primarias implements Constantes_consumidores {
	public static void main(String[] args) {
		
	}
	
	public String processar__banco(String nome, int rg, int cpf, String email, String Senha) {
		int v = 0;
		do {
			System.out.println("Para solicitar seu serviço faça seu login ou se cadastre gratuitamente:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Login");
			switch (v) {
			case 1:
				Informacoes_primarias chamar = new Informacoes_primarias();
				chamar.cadastro();
;				break;

			}
			
		} while (v == 0);
		
		
		return null;
	}
	
	public void cadastro() {
		StringBuilder sql = new StringBuilder();
		
		System.out.println("Nome: ");
		sql.append(nome_consumidores);
		
	}
}

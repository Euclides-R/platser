package perfil_user;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Informacoes_primarias {
	Scanner input = new Scanner(System.in);
	Dados_consumidor dados = new Dados_consumidor();

	public static void main(String[] args) {
		new Informacoes_primarias().processar();
	}

	public void processar() {
		Dados_consumidor info = new Dados_consumidor(1234, "nome", 1234, 5467, "string2", "String3");
		inserirdados_bancoCON(info);
	}

	public void inserirdados_bancoCON(Dados_consumidor dado) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO ");
		sql.append("Consumidores ");
		sql.append("( ");
		sql.append(" RG_Consumidores");
		sql.append(", ");
		sql.append("Name_Consumidores");
		sql.append(", ");
		sql.append("Id_Consumidores");
		sql.append(", ");
		sql.append("CPF_Consumidores");
		sql.append(", ");
		sql.append("Email_Consumidores");
		sql.append(", ");
		sql.append("Senha_Consumidores");
		sql.append(")");
		sql.append(" VALUES ");
		sql.append("( ");
		sql.append("?");
		sql.append(" , ");
		sql.append("?");
		sql.append(" , ");
		sql.append("?");
		sql.append(" , ");
		sql.append("?");
		sql.append(" , ");
		sql.append("?");
		sql.append(" , ");
		sql.append("?");
		sql.append(" )");

		conexao__banco.conexao__principal mc = new conexao__banco.conexao__principal();
		try (Connection conn = mc.conectarBanco(); PreparedStatement pstmCli = conn.prepareStatement(sql.toString());) {
			pstmCli.setInt(1, dado.getCpf_consumidores());
			pstmCli.setInt(2, dado.getId_consumidores());
			pstmCli.setString(3, dado.getNome_consumidores());
			pstmCli.setString(4, dado.getSenha());
			pstmCli.setString(5, dado.getEmail());
			pstmCli.setInt(6, dado.getId_consumidores());
		} catch (SQLException e) {
			if ("23505".equals(e.getSQLState())) {
				System.out.println("ITEM DUPLICADO");
			} else {
				e.printStackTrace();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

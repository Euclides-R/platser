package perfil_user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Teste_para_inserirdado {
	
	private void processar() {
		conexao__banco.FAQ f = new conexao__banco.FAQ();
		inserirFAQ(f);
		f = new conexao__banco.FAQ();
		inserirFAQ(f);
		f = new conexao__banco.FAQ();
		inserirFAQ(f);
	}
	
	public void inserirFAQ(conexao__banco.FAQ faq) {
		StringBuilder sql = new StringBuilder();
		sql.append(" INSERT_INTO ");
		sql.append(" consumidores ");
		sql.append("( ");

		sql.append("id_consumidores");
		sql.append(", ");
		sql.append("nome_completo");
		sql.append(", ");
		sql.append("rg_consumidores");
		sql.append(", ");
		sql.append("CPF_consumidores");
		sql.append(", ");
		sql.append("email_consumidores");
		sql.append(", ");
		sql.append("senha_consumidores");
		sql.append(") ");
		sql.append("VALUES");
		sql.append(" (");
		sql.append(" ? ");
		sql.append(",");
		sql.append(" ? ");
		sql.append(",");
		sql.append(" ? ");
		sql.append(")");

		System.out.println("Comando insert: " + sql);

		conexao__banco.conexao__principal minhaConexao = new conexao__banco.conexao__principal();
		try (Connection con = (Connection) minhaConexao) {
				PreparedStatement pstmCli = con.prepareStatement(sql.toString());

			pstmCli.setInt(1, faq.getCpf_consumidores());
			pstmCli.setInt(2, faq.getRg_consumidores());
			pstmCli.setString(3, faq.getEmail_consumidores());
			pstmCli.execute();

		} catch (SQLException e) {
			if ("Dados repetido".equals(e.getSQLState())) {
				System.out.println("Item duplicado");
			} else {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

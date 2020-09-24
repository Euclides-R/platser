package conexao__banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao__principal {
	
	public static void main(String[] args) {
		new conexao__principal().processar();
	}

	private void processar () {
		try {
			Connection con = new conexao__principal().conectarBanco();
			if (con != null) {
				System.out.println("Conectado com sucesso.");
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection conectarBanco() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/faculdade"; // 2
			Connection con = DriverManager.getConnection(url, "postgres", "#euclidesRSTUDIES");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
 
}

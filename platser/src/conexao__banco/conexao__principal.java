package conexao__banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao__principal {
	
	private Connection cx = null;
			
	public static void main(String[] args) {
		new conexao__principal().processar();
	}
	
	public void processar() {
		try {
			cx = new conexao__principal().connectionDB();
			if ( cx != null) {
				System.out.println("Conectado com sucesso.");
				cx.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection connectionDB() {
		try {
			Class.forName("org.postesql.Driver");
			String url = "jdbc:postgresql://localhost:5432/PlatSer";
			cx = DriverManager.getConnection(url, "postgres", "#euclidesRSTUDIES");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}
}

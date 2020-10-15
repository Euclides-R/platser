package perfil_user;

public class Dados_consumidor {

	private int id_consumidores;
	private String nome_consumidores;
	private int rg_consumidores;
	private int cpf_consumidores;
	private String email;
	private String senha;

	public Dados_consumidor(int id_con, String nome_con, int rg_con, int cpf_con, String email_con,
		String senha_con) {
		super();
		id_consumidores = id_con;
		nome_consumidores = nome_con;
		rg_consumidores = rg_con;
		cpf_consumidores = cpf_con;
		email = email_con;
		senha = senha_con;
	}
	
	public Dados_consumidor() {
		
	}

	public int getId_consumidores() {
		return id_consumidores;
	}

	public void setId_consumidores(int id_consumidores) {
		this.id_consumidores = id_consumidores;
	}

	public String getNome_consumidores() {
		return nome_consumidores;
	}

	public void setNome_consumidores(String nome_consumidores) {
		this.nome_consumidores = nome_consumidores;
	}

	public int getRg_consumidores() {
		return rg_consumidores;
	}

	public void setRg_consumidores(int rg_consumidores) {
		this.rg_consumidores = rg_consumidores;
	}

	public int getCpf_consumidores() {
		return cpf_consumidores;
	}

	public void setCpf_consumidores(int cpf_consumidores) {
		this.cpf_consumidores = cpf_consumidores;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Dados_consumidor [id_consumidores=" + id_consumidores + ", nome_consumidores=" + nome_consumidores
				+ ", rg_consumidores=" + rg_consumidores + ", cpf_consumidores=" + cpf_consumidores + ", email=" + email
				+ ", senha=" + senha + "]";
	}
}

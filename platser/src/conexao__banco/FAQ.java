package conexao__banco;

public class FAQ {
	
	private int id_consumidores;
	private int	rg_consumidores;
	private int cpf_consumidores;
	private String email_consumidores;
	private String nome_consumidores;
	
	@Override
	public String toString() {
		return "FAQ [id_consumidores=" + id_consumidores + ", rg_consumidores=" + rg_consumidores
				+ ", cpf_consumidores=" + cpf_consumidores + ", email_consumidores=" + email_consumidores
				+ ", nome_consumidores=" + nome_consumidores + "]";
	}
	public int getId_consumidores() {
		return id_consumidores;
	}
	public void setId_consumidores(int id_consumidores) {
		this.id_consumidores = id_consumidores;
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
	public String getEmail_consumidores() {
		return email_consumidores;
	}
	public void setEmail_consumidores(String email_consumidores) {
		this.email_consumidores = email_consumidores;
	}
	public String getNome_consumidores() {
		return nome_consumidores;
	}
	public void setNome_consumidores(String nome_consumidores) {
		this.nome_consumidores = nome_consumidores;
	}	
}
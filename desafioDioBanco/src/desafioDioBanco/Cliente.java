package desafioDioBanco;

public class Cliente {
	
	protected String nome;
	protected String SobreNome;
	protected String CPF;
	protected String endereço;
	

	
	public String getNome() {
		return nome; 
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return SobreNome;
	}
	public void setSobreNome(String sobreNome) {
		SobreNome = sobreNome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
}

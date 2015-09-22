package aula08;

public class Cliente extends Pessoa{
	
	private String cpf;
	private String rg;
	
		public Cliente(){}
	
	public Cliente(String cpf){
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	// construtores
	public Cliente(String nome, String cpf ) {
			super(nome);
			
			this.cpf = cpf;
		}
}

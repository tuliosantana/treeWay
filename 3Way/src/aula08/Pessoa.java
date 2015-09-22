package aula08;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
		
		public Pessoa(){}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void ImprimeNome(){
	System.out.println("O nome da pessoa e : " + nome);
	}
	
	private Long identificador;
	
	public Long getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(Long identificador){
		this.identificador = identificador;
	}
}

package aula08;

public class ClienteDosSonhos extends Cliente{
	
	public ClienteDosSonhos ( String nome, int cpf ) {
			
	super(nome, cpf);
		}
	public boolean ImprimeNome() {
		
		}
	System.out.println("Esse e o cliente dos sonhos, seu nome é : " 
	+ getNome() + " No CPF: " + cpf + " Seu endereco :" + getEndereco());
}

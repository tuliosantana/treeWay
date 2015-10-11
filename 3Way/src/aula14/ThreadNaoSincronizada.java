package aula14;

public class ThreadNaoSincronizada {
	
	public static void main(String[] args){
		
		new ImprimeStringsThread("Voce ", "Aqui ");
		new ImprimeStringsThread("Muito Bem ", "Obrigado");
		new ImprimeStringsThread("Como voce ", "esta ?");
	}
}

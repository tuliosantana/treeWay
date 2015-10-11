package aula14;

//Subclass extends Thread class
public class ImprimeNomeThread extends Thread{
	public ImprimeNomeThread(String nome){
		
		super(nome);
		//metodo start() dentro do construtor da subclasse
		start();
	}
	// Sobrescreve metodo run() da classe Thread.	
	// Este metodo toma a execucao metodo start() for invocado
	public void run(){
		System.out.println("metodo run() da thread " + this.getName() + "e chamado");
		
		for (int i = 0; i < 10; i++){
			try{
				sleep(100);
				System.out.println(i + " : " + this.getName());
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println("Criando instancia de ImpreNomeThread...");
		
		ImprimeNomeThread pnt1 = new ImprimeNomeThread("A");
		ImprimeNomeThread pnt2 = new ImprimeNomeThread("B");
		ImprimeNomeThread pnt3 = new ImprimeNomeThread("C");
		
		// Inicia thread pela invocacao do metodo start()
		System.out.println("Chamando metodo start() da thread " + pnt1.getName());
		System.out.println("Chamando metodo start() da thread " + pnt2.getName());
		System.out.println("Chamando metodo start() da thread " + pnt3.getName());
		//minhaThtead.start();
	}
	
}

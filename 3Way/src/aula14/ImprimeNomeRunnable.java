package aula14;

import com.sun.javafx.iio.png.PNGDescriptor;

public class ImprimeNomeRunnable implements Runnable {
	
	Thread thread;
	
	public ImprimeNomeRunnable(String nome) {
		
		thread = new Thread(this, nome);
		thread.start();
	}
	
	// implementacao do metodo run() da interface Runnable
	
	public void run(){
		
		for (int i = 0; i < 10; i++){
			try {
				Thread.sleep(1000);
				// Agora é permitido porque é uma thread
				System.out.println(i + " : " + thread.getName());
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
}
	public static void main(String[] args){
		ImprimeNomeThread pntr1 = new ImprimeNomeThread("RA");
		System.out.println(pntr1);
		
		ImprimeNomeThread pntr2 = new ImprimeNomeThread("RB");
		System.out.println(pntr2);
		
		ImprimeNomeThread pntr3 = new ImprimeNomeThread("RC");
		System.out.println(pntr3);
	}
}


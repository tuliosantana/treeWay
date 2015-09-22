package aula06;


public class TestaPassagemValor {

	public static void main(String[] args) {
		
		int i = 10;
		//Imprime valor de i
		System.out.println("inicia metodo main e i = " + i);
		
		//chama o metodo test, que esta definido a baixo
		//e passa valor inteiro como um parametro. Uma vez que
		//int é um tipo primitivo, este argumento e passado por valor.
		test(i);
		// imprime valor de i, que não muda
		System.out.println("termina o metodo main e i = " + i);
		

	}
	//metodo statico na classe
	public static void test(int j,int k) {
		
		System.out.println("inicia metodo test e j = " + j);
			
		//muda valor parametro i
		j = 33;
		System.out.println("termina metodo test e j = " + j);
		
		
	}


}

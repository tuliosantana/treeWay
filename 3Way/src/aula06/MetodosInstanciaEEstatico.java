package aula06;

public class MetodosInstanciaEEstatico {

	public static void main(String[] args) {
		
		//Criando duas instancias da classe String
		String strInstancia1 = new String("Sou uma instancia de objeto da classe String");
		String strInstancia2 = "Viva com paixão";
		
		//Invoca o método de instancia charAt()
		//atraves das instancias da Classe String
		char x = strInstancia1.charAt(2);
		char y = strInstancia2.charAt(1);
		char z = strInstancia2.charAt(0);
		
		System.out.println("O 3.o caracter da strInstancia1 = " + x);
		System.out.println("O 2.o caracter da strInstancia1 = " + y);
		System.out.println("O 1.o caracter da strInstancia1 = " + z);
		
		boolean b = strInstancia1.equalsIgnoreCase(strInstancia2);
		String strInstancia3 = b ? "SIM" : "NÃO" ;
		System.out.println("As variáveis strInst1" + "e strInst2 o mesmo" + "conjunto de caracteres?" + strInstancia3);
		
		//Invocando o metodo statico, valueOf (int i), da classe String
		int i = 23;
		String strInstancia4 = String.valueOf(i);
		System.out.println("valos da instancia 4 = " + strInstancia4);
		
		String strInstancia5 = new String("34");
		int ii = Integer.parseInt(strInstancia5);
		System.out.println("valor de ii = " + ii);
		
		
		char f = String.charAt(2);
		
		
		//metodo endsWith()
		String str = "Hello";
		System.out.println(str.endsWith("slo"));
		//metodo floor()
		System.out.println(Math.floor(3.14));
		//metodo isDigit()
		System.out.println("0=" + Character.isDigit('0'));
		System.out.println("A=" + Character.isDigit('A'));
		
	}

}

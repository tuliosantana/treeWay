package aula06;

public class ClasseEObjeto {

	public static void main(String[] args) {
		
		//criando a instancia de uma classe String
		String strObjeto1 = new String("Este objeto e uma instancia da classe String");
		System.out.println("estado da instancia de strObejeto1 " + strObjeto1);
		
		String strObejeto2 = "Este obejto é uma instancia da classe String";
		System.out.println("estado da instancia strObejeto2 " + strObejeto2);
		
		String strObejto3 = new String("Este e outra instancia da classe String");
		System.out.println("etado da instancia strObejeto3 " + strObejto3);
		
		//Criando a instancia de uma classe Integer
		Integer intObejeto1 = new Integer(20);
		System.out.println("estado da instancia intObejeto1 " + intObejeto1);
		
		//Criando instancia de uma clasee Double
		Double dblObjeto1 = new Double(2.5);
		System.out.println("estado da instancia dblObjeto1 " + dblObjeto1);

	}

}

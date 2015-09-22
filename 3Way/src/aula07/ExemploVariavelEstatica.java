package aula07;

public class ExemploVariavelEstatica {

	public static void main(String[] args) {
		// Acessando variáveis estaticas da
		// veja que você não precisou criar classe UtilData
		System.out.println("Dia da semana " + UtilData.DOMINGO);
		System.out.println("Dia da semana " + UtilData.SEGUNDA);
		System.out.println("Dia da semana " + UtilData.TERCA);
		System.out.println("Dia da semana " + UtilData.QUARTA);
		System.out.println("Dia da semana " + UtilData.QUINTA);
		System.out.println("Dia da semana " + UtilData.SEXTA);
		System.out.println("Dia da semana " + UtilData.SABADO);
		
		// Acesso a variável de instância data da classe UtilData
		// Você tem que criar uma instância da classe antes de voce poder acessar seu valor.
		UtilData data = new UtilData();
		System.out.println("Mes do ano " + data.JANEIRO);
		System.out.println("Mes do ano " + data.FEVEREIRO);
		System.out.println("Mes do ano " + data.MARCO);
		System.out.println("Mes do ano " + data.ABRIL);
		
		// A variável estática pode ser acessada por variável de instância de objeto
				
		System.out.println("Dia da Semana" + data.DiaDaSemana);
		data.DiaDaSemana = 3;
		System.out.println("Mudou Dia da Semana" + data.DiaDaSemana);
		
		// Variáveis estáticas podem sem acessada de múltiplas instâncias
				
		UtilData data2 = new UtilData();
		System.out.println("instancia 1 Dia do mês " + UtilData.DiaDoMes);
		System.out.println("instancia 2 Dia do mês " + UtilData.DiaDoMes);
		data2.DiaDoMes = 20;
			
		System.out.println("instancia 1 Mudou Dia do Mes" +
		UtilData.DiaDoMes);				
		System.out.println("instancia 2 Mudou Dia do mês" +
		data2.DiaDoMes);	
		
	}

}

package aula07;
import java.util.Calendar;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class UtilData {
	
	//representação dias da semana
	static int DOMINGO = Calendar.SUNDAY;
	static int SEGUNDA = Calendar.MONDAY;
	static int TERCA   = Calendar.TUESDAY;
	static int QUARTA  = Calendar.WEDNESDAY;
	static int QUINTA  = Calendar.THURSDAY;
	static int SEXTA   = Calendar.FRIDAY;
	static int SABADO  = Calendar.SATURDAY;
		
	// Constrói uma data representando agora
	public static Date data(){
		return Calendar.getInstance().getTime();
	}
	
	public static Calendar data(int dia, int mes, int ano){
		
		return data(dia, mes, ano, 0, 0, 0);
	}
	
	public static Calendar data(int dia, int mes, int ano, int hora, int min, int seg){
		
		Calendar data = Calendar.getInstance();
		data.set(ano, --mes, dia, hora, min, seg);
		data.set(Calendar.MILLISECOND, 0);
		return data;
	}
	
	// Retorna uma data com dia, mes e ano passado como String e formato  argumento
	public static Calendar data(String data){
		
		return data(Integer.valueOf(data.split("/")[0]), Integer.valueOf(data.split("/")[1]),
					Integer.valueOf(data.split("/")[2]));
	}
	
	public static Date getDate(Calendar data){
		
		return data.getTime();
	}
	
	// Formata uma data no formato dd/mm/aaaa
	public static String DDMMAAAA(Date data){
		
		return new java.text.SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	// Formata uma data no formato dd/mm/aaaa hh:mm
	public static String DDMMAAAAHHMM(Date data){
		
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
	// método estático que retorna o valor da data formatado como String
	public static String agora(Date data){
		
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
	
	// Retorna o Ano correspondente a esta data
	public int getAno(Date data){
		
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.YEAR);
	}	
	// Retorna o mês correspondendo a esta data	
	public int getMes(Date data){
		
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.MONTH);
	}
	//Retorna o dia correspondente a esta data
	public int getDia(Date data){
		
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.DAY_OF_MONTH);
	}
	// Acrescenta um número de dias à data
	public void somarDia(Date data, int numDias){
		
		final Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		calendario.add(Calendar.DAY_OF_MONTH, numDias);
	}
	
	
	
	
	
}

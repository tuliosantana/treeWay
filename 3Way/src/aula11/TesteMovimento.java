package aula11;
import java.util.*;

import aula07.Conta;
import aula07.EnumTipoTransacao;
import aula07.Transacao;
import aula07.UtilData;

public class TesteMovimento {

	public static void main(String[] args) {
		
		Movimento<Transacao> m1 = new Movimento<Transacao>();
		Movimento<String> m2 = new Movimento<String>();
		
		m1.add(new Transacao(UtilData.data(), new
		Conta("Fulano", 1000), new Conta("Ciclano", 2000), 0.0, "nda",
		EnumTipoTransacao.TRANFERENCIA));
		
		m2.add(new String("nda de +"));
		Iterator it;
		it = m1.getTransacoes();
						
		while (it.hasNext())
		System.out.println(it.next());
				
		it = m2.getTransacoes();		
		while (it.hasNext())
		System.out.println(it.next());
	}

}

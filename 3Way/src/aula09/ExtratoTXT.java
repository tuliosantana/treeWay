package aula09;
import java.util.Iterator;

import aula07.Conta;
import aula07.EnumTipoTransacao;
import aula07.Transacao;
import aula07.UtilData;

public class ExtratoTXT implements IExtrato {
	
	protected Conta conta;
	
	
	public ExtratoTXT(Conta conta) {
		this.conta = conta;
	}
		
	public String formatar() {
			
	String newLine = System.getProperty("line.separator");
			
	String resultado = "Extrato de conta " + newLine;
			
	resultado += String.format("%-20.20s", "Data") + " "
	+ String.format("%7.7s", "Debito") + " "
	+ String.format("%7.7s", "Credito") + " "
	+ String.format("%15.15s", "Valor") + " "
	+ String.format("%s", "Descricao") + newLine;
	Iterator it = conta.getMovimento().iterator();
	while (it.hasNext()) {
	    Transacao t = (Transacao) it.next();
	    if(t.getTipoTransacao() == EnumTipoTransacao.TRANFERENCIA){
	    	resultado += String.format("%-20.20s", UtilData.DDMMAAAAHHMM(t.getData()))+ " "
	    			+ String.format("%7d", t.getContaDebito().getNumero())+ " "
	    			+ String.format("%7d", t.getContaCredito().getNumero())
	    			+ " " + String.format("%15.15s", t.getValor()) + " "
	    		    + String.format("%s", t.getDescricao()) +newLine;	
	    }	
	}
	
	return resultado;
	
	}

}

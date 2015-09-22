package aula07;
import java.util.*;

public class Transacao {

	private Date   data;
	private Conta  contaDebito;
	private Conta  contaCredito;
	private double valor;
	private String descricao;
	
	private EnumTipoTransacao tipoTransacao;
	
public Transacao( Date data, Conta contaDebito, Conta contaCredito, Double valor, String descricao, EnumTipoTransacao tipoTRansacao){
	this.data = data;
	this.contaCredito = contaCredito;
	this.contaDebito  = contaCredito;
	this.valor = valor;
	this.descricao = descricao;
}

	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Conta getContaDebito() {
		return contaDebito;
	}
	
	public void setContaDebito(Conta contaDebito) {
		this.contaDebito = contaDebito;
	}
	
	public Conta getContaCredito() {
		return contaCredito;
	}
	
	public void setContaCredito(Conta contaCredito) {
		this.contaCredito = contaCredito;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public EnumTipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}
	
	public void setTipoTransacao(EnumTipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public String toString(){
		
		if(EnumTipoTransacao.TRANFERENCIA == getTipoTransacao()){
			
			return " Transacao data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta debito -> "
			+ getContaDebito().getNumero() + ", conta credito -> " 
			+ getContaCredito().getNumero() + ", valor " + getValor() + ", descricao -> " 
			+ getDescricao();
		
		}else if(EnumTipoTransacao.DEPOSITO == getTipoTransacao()){
			
			return " Deposito data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " 
			+ getContaCredito().getNumero() + ", valor " 
			+ getValor() + ", descricao -> " 
			+ getDescricao();
		
		}else if (EnumTipoTransacao.SAQUE == getTipoTransacao()){
			
			return " Saque data " + UtilData.DDMMAAAAHHMM(getData()) + ", conta " 
			+ getContaCredito().getNumero() + ", valor " 
			+ getValor() + ", descricao -> " 
			+ getDescricao();
		}
		
		return "Nenhum tipo de transação";
	}
	
    private Long identificador;
	
	public Long getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(Long identificador){
		this.identificador = identificador;
	}
}

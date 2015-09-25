package aula07;
import java.beans.FeatureDescriptor;
import java.util.*;

import aula08.Cliente;
import aula08.Objeto;
import aula09.EntidadeBanco;
import aula12.Agencia;
import aula07.Transacao;

public class Conta extends EntidadeBanco {
		
	private Long identificador;
	private int numero;
	private Cliente titular;
	private double saldo;
	private Date dataAbertura;
	private ArrayList movimento;
	private Collection<Transacao> transacoes;
	private Agencia agencia;
	
	public int getNumero() {
		return numero;
	}

	public Conta(){
		dataAbertura = UtilData.data();
		movimento = new ArrayList();
	}
	
	//construtor com dois parametros
	public Conta (Cliente nome, int nconta){
		this();
		numero  = nconta;
		titular = nome;
		saldo   = 0.0; //conta em reais e zerada
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public ArrayList getMovimento() {
		return movimento;
	}

	public void setMovimento(ArrayList movimento) {
		this.movimento = movimento;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public Long getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(Long identificador){
		this.identificador = identificador;
	}
	
	//testa a igualdade de um objeto com este
	@Override
	public boolean equals(Object objeto){
		
		boolean resultado = false;
		if (( objeto != null) && ( objeto instanceof Conta)){
			Conta c = (Conta) objeto;
			if (getNumero() == c.getNumero()){
				resultado = true;
			}
		}
		return resultado;
	}
	@Override
	public int hashCode(){
		return getNumero();
	}
	@Override
	public String toString(){
		return getNumero() + "-" + getTitular().getNome();
	}
	
	
}

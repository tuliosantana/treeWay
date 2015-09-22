package aula07;
import java.util.*;

public class Conta {
		
	private int numero;
	private String titular;
	private double saldo;
	private Date dataAbertura;
	private ArrayList movimento;
	
	public int getNumero() {
		return numero;
	}

	public Conta(){
		dataAbertura = UtilData.data();
		movimento = new ArrayList();
	}
	
	//construtor com dois parametros
	public Conta (String nome, int nconta){
		this();
		numero  = nconta;
		titular = nome;
		saldo   = 0.0; //conta em reais e zerada
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
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
	
    private Long identificador;
	
	public Long getIdentificador(){
		return identificador;
	}
	
	public void setIdentificador(Long identificador){
		this.identificador = identificador;
	}
	
	
	
}

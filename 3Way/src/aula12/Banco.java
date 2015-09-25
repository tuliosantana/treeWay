package aula12;

import java.util.Collection;
import aula09.EntidadeBanco;

public class Banco extends EntidadeBanco {
	
	private Long identificador;
	private int numero;
	private String nome;
	private Collection<Agencia> agencias;
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Collection<Agencia> getAgencias() {
		return agencias;
	}
	public void setAgencias(Collection<Agencia> agencias) {
		this.agencias = agencias;
	}
	
	
}

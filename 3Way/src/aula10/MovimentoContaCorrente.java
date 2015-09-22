package aula10;

import aula07.Conta;
import aula07.ContaService;
import aula09.ExtratoTXT;

public class MovimentoContaCorrente {
	
	public static void main(String[] args) {
		
		ContaService operacoesConta = new ContaService();
		Conta correntista1 = new Conta("Aluno", 1001);
		Conta correntista2 = new Conta("Aluna", 21);
		
		operacoesConta.depositar(correntista1, 100);
		
		try {
			operacoesConta.transferir(correntista1, 600, correntista2);
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			operacoesConta.transferir(correntista1, 99.00, correntista2);
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ExtratoTXT movimento = new ExtratoTXT(correntista1);
		System.out.println(movimento.formatar());
	}
}

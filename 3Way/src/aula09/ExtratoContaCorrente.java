package aula09;

import aula07.Conta;
import aula07.ContaService;

public class ExtratoContaCorrente {

	public static void main(String[] args) {
		
		ContaService operacoesConta = new ContaService();
		Conta correntista1 = new Conta("Aluno", 1001);
		Conta correntista2 = new Conta("Professor", 2002);
		
		operacoesConta.depositar(correntista1, 1000);
		operacoesConta.transferir(correntista1, 450.00,correntista2);
		operacoesConta.transferir(correntista2, 50.00,correntista1);
		
		IExtrato movimento1 = new ExtratoHTML(correntista1);
		System.out.println(movimento1.formatar());
		
	}

}

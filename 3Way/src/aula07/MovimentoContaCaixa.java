package aula07;

import aula08.Cliente;

public class MovimentoContaCaixa {

	public static void main(String[] args) {
		
		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();
						
		// cria conta caixa
		Cliente c1 = new Cliente("João");
		Cliente c2 = new Cliente("Jose");
		
		Conta caixa = new Conta(c1, 0);
		caixa.setSaldo(100000);
				
		Conta correntista1 = new Conta(new Cliente ("Hinfe Liz"), 1001);
				
		// faz deposito		
		operacoesConta.depositar(correntista1, 1000);
		Conta correntista2 = new Conta(c2, 1002);
		
		// faz deposito, transferir para conta caixa
		operacoesConta.depositar(correntista2, 2000);
				
		// Mostra saldo correntista 1		
		System.out.println("correntista1 saldo = " + correntista1.
		getSaldo());
				
		// Mostra saldo correntista 2		
		System.out.println("correntista2 saldo = " + correntista2.
		getSaldo());
		if (operacoesConta.transferir(correntista1, 100.00,
				
		correntista2)) {
					
		System.out.println("transferencia ok");
		
		} else {
			System.out.println("nao pode transferir !");
		
}
		
		// Mostra saldo correntista 1
				
		System.out.println("correntista1 saldo =" + correntista1.
		getSaldo());
				
		// Mostra saldo correntista 2
		System.out.println("correntista2 saldo =" + correntista2.
		getSaldo());
						
		// faz saque
		operacoesConta.sacar(correntista2, 120.00);
		System.out.println("saque ok");
				
		// Mostra saldo correntista 2
		System.out.println("correntista2 saldo =" + correntista2.
		getSaldo());	
		
		// mostra movimento correntista 1
		System.out.println(correntista1.getMovimento());
		// mostra movimento correntista 2
		System.out.println(correntista2.getMovimento());
		
	}

}

package aula07;

public class SobrecargaTransferir {

	public static void main(String[] args) {
		
		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();
		
		//crie uma instancia da classe conta
		Conta conta1 = new Conta();
		
		//configurar instancia da classe conta
		conta1.setNumero(123456789);
		conta1.setSaldo(500.00);
		
		//cria nova instancia de Conta para transferencia
		Conta conta2 = new Conta();
		conta2.setSaldo(50.00);
		
		//cria nova instancia de Conta para transferencia
		Conta conta3 = new Conta();
		
		System.out.println("Transferir 400.00 da conta1 para conta2 ");
		//transfere valor entre as contas utilizando transferencia sem limite
		operacoesConta.transferir(conta1, 400.00, conta2);
		System.out.println("Saldo da conta1 : " + conta1.getSaldo());
		System.out.println("Saldo da conta2 : " + conta2.getSaldo());
		System.out.println("Saldo da conta3 : " + conta3.getSaldo());
		
		//transfere valor entre as contas ultilizando o limite
		operacoesConta.transferir(conta1, 200.00, conta2, 300.00);
		
		System.out.println("Saldo da conta 1 " + conta1.getSaldo());
		System.out.println("Saldo da conta 2 " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 " + conta3.getSaldo());
		//***
		System.out.println("*** Transferindo 100.00, da conta2 para conta3 com limite : ");
		System.out.println("Saldo da conta 2 " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 " + conta3.getSaldo());
		operacoesConta.transferir(conta2, 100.00, conta3, 200.00);
		System.out.println("Saldo da conta 2 " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 " + conta3.getSaldo());
		
		//***
		System.out.println("*** Transferindo 100.00, da conta2 para conta3 sem limite : ");
		System.out.println("Saldo da conta 2 " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 " + conta3.getSaldo());
		operacoesConta.transferir(conta2, 100.00, conta3);
		System.out.println("Saldo da conta 2 " + conta2.getSaldo());
		System.out.println("Saldo da conta 3 " + conta3.getSaldo());
		

	}

}

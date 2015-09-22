package aula07;
import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		
		//objeto para ler dados do console, captura o que foi digitado
		Scanner c = new Scanner(System.in);
		
		//declara e inicia o saldo com valor digitado pelo usuario
		System.out.println("Digite o saldo inicial da conta ");
		double saldoConta = c.nextDouble();
		
		//declara e inicializa o numero da conta digitada pelo usuario
		System.out.println("Digite o numero da conta ");
		int numeroConta = c.nextInt();
		
		// Cria uma instância de ContaService onde está presente as operações para Objeto Conta
		ContaService operacoesConta = new ContaService();
		
		//Cria a instancia da classe conta
		Conta conta1 = new Conta();
		
		//altera valor dos atributos da instancia da classe Conta
		conta1.setNumero(numeroConta);
		conta1.setSaldo(saldoConta);
		
		//Nova instancia de Conta para transferencia
		Conta conta2 = new Conta();
		//nova instancia da Conta para transferencia
		Conta conta3 = new Conta();
		
		//Mostrar dados da instancia da classe conta
		System.out.println("O numero da conta1 : " + conta1.getNumero());
		System.out.println("O saldo da conta1 : " + conta1.getSaldo());
		
		//Chama metodo depositar para adicionar saldo da conta
		System.out.println("Será creditado 100 reais na ocnta ");
		operacoesConta.depositar(conta1, 100.00);
		System.out.println("Saldo da conta1 : " + conta1.getSaldo());
		
		//Chama ao metodo sacar para debitar no saldo  da conta
		System.out.println("Sera debitado 56.43 reais da conta ");
		operacoesConta.sacar(conta1, 56.43);
		System.out.println("saldo da conta1 : " + conta1.getSaldo());
		
		System.out.println("Saldo da conta1 : " + conta1.getSaldo());
		System.out.println("Saldo da conta2 : " + conta2.getSaldo());
		System.out.println("Saldo da conta3 : " + conta3.getSaldo());
		
		//Chamada metodo tranferir para retirar o valor de conta1 para conta2
		System.out.println("Transferir 50.00 da conta 1 para conta 2");
		operacoesConta.transferir(conta1, 50.00, conta2);
		System.out.println("saldo da conta 1 ; " + conta1.getSaldo());
		System.out.println("saldo da conta 2 : " + conta2.getSaldo());
		System.out.println("saldo da ocnta 3 ; " + conta3.getSaldo());
		
		System.out.println("Transferir 100.23 da conta2 para conta3");
		System.out.println("saldo da conta 2 antes da transferencia : " + conta2.getSaldo());
		System.out.println("saldo da ocnta 3 antes da transferencia ; " + conta3.getSaldo());
		operacoesConta.transferir(conta2, 100.23, conta3);
		System.out.println("saldo da conta 2 : " + conta2.getSaldo());
		System.out.println("saldo da ocnta 3 ; " + conta3.getSaldo());
	}

}

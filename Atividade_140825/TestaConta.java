package Atividade_140825;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		
		c1.numero = 1234;
		c1.limite = 500;
		c1.saldo = 1000;
		

		c2.numero = 5678;
		c2.limite = 250;
		c2.saldo = 500;
		
		System.out.println("O numero da conta 1 é: "+c1.numero);
		System.out.println("O Limite da conta 1 é: "+c1.limite);
		System.out.println("O Saldo da conta 1 é: "+c1.saldo);
		
		System.out.println("O numero da conta 2 é: "+c2.numero);
		System.out.println("O Limite da conta 2 é: "+c2.limite);
		System.out.println("O Saldo da conta 2 é: "+c2.saldo);
		

	}

}

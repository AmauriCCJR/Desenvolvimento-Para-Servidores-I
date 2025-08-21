package Atividade_140825;

public class TestaTudo {

	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		Cliente c1 = new Cliente();
		Conta c01 = new Conta();
		CartaoDeCredito cdc1 = new CartaoDeCredito();
		
		
		c1.codigo = 1;
		c1.Nome = "Amauri Carlos";
		a1.numero = 1234;
		c01.numero = 1234;
		c01.saldo = 1000;
		c01.limite = 500;
		cdc1.numero = 1111;
		cdc1.dataValidade = "01/01/2025";
				
		System.out.println("Agencia: "+ a1.numero);
		System.out.println("Código do Cliente: "+c1.codigo);
		System.out.println("Nome do Cliente: "+c1.Nome);
		System.out.println("Numero da Conta do Cliente: "+c01.numero);
		System.out.println("Limite da Conta do Cliente: "+c01.limite);
		System.out.println("Saldo da Conta do Cliente: "+c01.saldo);
		System.out.println("Numero do Cartão de Crédito: "+cdc1.numero);
		System.out.println("Data de Validade do Cartão: "+cdc1.dataValidade);
	}

}

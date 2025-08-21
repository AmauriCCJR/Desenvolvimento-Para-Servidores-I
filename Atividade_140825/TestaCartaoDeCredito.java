package Atividade_140825;
public class TestaCartaoDeCredito {

	public static void main(String[] args) {
		CartaoDeCredito CDC1 = new CartaoDeCredito();
		CDC1.numero = 1111;
		CDC1.dataValidade = "01/01/2025";
		
		
		CartaoDeCredito CDC2 = new CartaoDeCredito();
		CDC2.numero = 2222;
		CDC2.dataValidade = "02/02/2025";

		
		System.out.println("Numero do Cartão 1 = "+ CDC1.numero);
		System.out.println("Data do Cartão 1 = "+ CDC1.dataValidade);
		
		System.out.println("Numero do Cartão 2 = "+ CDC2.numero);
		System.out.println("Data do Cartão 2 = "+ CDC2.dataValidade);
	}

}

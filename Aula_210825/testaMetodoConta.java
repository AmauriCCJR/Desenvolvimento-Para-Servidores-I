package Aula_210825;

public class testaMetodoConta {

	public static void main(String[] args) {
		conta C = new conta();
		
		C.depositar(1000);
		C.imprimeExtrato();
		C.sacar(100);
		C.imprimeExtrato();
		
		double saldoDisponivel = C.consultaSaldoDisponivel();
		
		System.out.println("Saldo Diponivel: "+ saldoDisponivel);
	

	}

}

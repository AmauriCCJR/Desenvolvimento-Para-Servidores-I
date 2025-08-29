package Aula_280825;

public class newConta {
	int numero;
	double saldo;
	double limite = 100;
	
	
	
	public void depositar(double valor) {
		this.saldo += valor;
		this.descontaTarifa();
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void imprimeExtrato() {
		System.out.println("Saldo: "+ this.saldo);
	}
	
	public double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	//Quando existir um metodo que serve de suporte para outro metodo, ele deve ser privado
	//Como no exemplo abaixo
	private void descontaTarifa() {
		this.saldo -= 0.1;
	}
}

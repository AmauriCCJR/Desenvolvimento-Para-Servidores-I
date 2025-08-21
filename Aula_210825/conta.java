package Aula_210825;

public class conta {
	int numero;
	double saldo;
	double limite = 100;
	
	//Metodos(funções)
	//Todo método que não tiver iniciado com void tem que ter um return, void não necessita de return
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	
	void imprimeExtrato() {
		System.out.println("Saldo: "+ this.saldo);
	}
	
	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}

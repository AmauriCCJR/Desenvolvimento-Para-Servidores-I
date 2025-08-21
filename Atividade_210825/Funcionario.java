package Atividade_210825;

public class Funcionario {
	String nome;
	double Salario;
	
	
	double aumentaSalario(double valor) {
		return this.Salario += valor;
		//System.out.println("O salário foi reajustado para: R$"+this.Salario);
	}
	
	void consultarDados() {
		System.out.println ("Nome do funcionário: "+this.nome);
		System.out.println ("Salário do funcionário: "+ this.Salario);
	}
}

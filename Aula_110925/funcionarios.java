package Aula_110925;

public class funcionarios {
	private String nome;
	private double salario;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcBonificacao() {
		return this.salario * 0.1;
	}
	
	public void MostrarDados() {
		System.out.println("Nome do funcionario: "+ getNome());
		System.out.println("Salário do funcionário: "+ getSalario());
		System.out.println("Valor a ser bonificado: "+ calcBonificacao());
	}
	
	
}



package Atividade_280825_pratica;

public class Cliente {
	private String nome;
	private int codigo;
	private double salario;
	private double taxa;
	
	
	
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double aumentaSalario() {
		return this.aumentaSalario(0.1);
	}
	
	public double aumentaSalario(double porcent) {
		return this.salario = this.salario + (this.salario * porcent);
	}
	
	
	
	
	
	
	
	
}

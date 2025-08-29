package Atividade_280825_Encapsulamento;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String sobrenome; 
	
	//Get = retorna um campo
	//Set = Altera um campo
	
	//btn direito -> Source -> Generate Getters and Setters ---> Agilizar a criação desses metodos
	
	//Encapsulamento consiste em deixar os atributos privados para evitar erros e acessar eles atraves
	//De alguns metodos
	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

package Atividade_280825_Encapsulamento;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		//Encapsulamento consiste em deixar os atributos privados para evitar erros e acessar eles atraves
		//De alguns metodos
		f.setNome( "Amauri");
		f.setSalario(1250);
		
		System.out.println(f.getNome());
		System.out.println(f.getSalario());

	}

}

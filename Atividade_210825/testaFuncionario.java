package Atividade_210825;

public class testaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.nome = "Amauri";
		func1.Salario = 1650;
		
		func2.nome = "Carlos";
		func2.Salario = 1865;
		
		System.out.println("Nome do funcionário 1: "+func1.nome);
		System.out.println("Salário do funcionário em R$:"+func1.Salario);
		System.out.println("------------------------------------------------");
		System.out.println("Nome do funcionário 2: "+func2.nome);
		System.out.println("Salário do funcionário em R$:"+func2.Salario);
		System.out.println("------------------------------------------------");
		
		func1.Salario = func1.aumentaSalario(135);
		func2.Salario = func2.aumentaSalario(85);
		
		System.out.println("------------------------------------------------");
		func1.consultarDados();
		System.out.println("------------------------------------------------");
		func2.consultarDados();
		System.out.println("------------------------------------------------");

	}

}


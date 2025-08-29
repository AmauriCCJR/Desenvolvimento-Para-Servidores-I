package Aula_280825;

public class testaGerente {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.salario = 1000;
		
		System.out.println("Salario R$: "+g.salario);
		
		System.out.println("Aumentando o salário em 10%:");
		g.aumentoSalario();
		System.out.println("Salario com 10% -> R$: "+g.salario);
		
		
		System.out.println("Aumentando o salário em 30%:");
		g.aumentoSalario(0.3);
		System.out.println("Salario com 30% -> R$: "+g.salario);
		
	}

}

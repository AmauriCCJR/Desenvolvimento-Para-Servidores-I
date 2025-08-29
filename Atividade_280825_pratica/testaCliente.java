package Atividade_280825_pratica;

public class testaCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		
		c.setNome("Amauri Carlos");
		c.setCodigo(7);
		c.setSalario(2000);
		c.setTaxa(50);
		
		System.out.println("O nome do Cliente é: "+c.getNome());
		System.out.println("O código do cliente é: "+ c.getCodigo());
		System.out.println("O salário do Cliente é: R$"+c.getSalario());
		System.out.println("A taxa de aumento de salário é de: "+c.getTaxa()+"%");
		System.out.println("O salário reajustado passa a ser:"+c.aumentaSalario());
		
		

	}

}

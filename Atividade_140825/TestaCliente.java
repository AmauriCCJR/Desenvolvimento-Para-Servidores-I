package Atividade_140825;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.codigo = 1;
		c1.Nome = "Amauri Carlos";
		
		Cliente c2 = new Cliente();
		c2.codigo = 2;
		c2.Nome = "Junior";
		
		
		System.out.println("Código do cliente 1: "+c1.codigo);
		System.out.println("Nome do cliente 1: "+c1.Nome);
		
		System.out.println("Código do cliente 2: "+c2.codigo);
		System.out.println("Nome do cliente 2: "+c2.Nome);
		
	}

}

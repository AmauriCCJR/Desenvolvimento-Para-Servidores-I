package Aula_110925;

public class testeFuncionarios {

	public static void main(String[] args) {
		
		gerentes g = new gerentes();
		secretarias s = new secretarias();
		telefonistas t = new telefonistas();
		
		
		g.setNome("Amauri Carlos");
		g.setSalario(3000);
		g.setUsuario("amauri.carlos");
		g.setSenha("1234");
		
		s.setNome("Maria Joana");
		s.setSalario(2200);
		s.setRamal(1334);
		
		t.setNome("Fernando Pereira");
		t.setSalario(2350);
		t.setEstacaodeTrabalho(7);
		
		/*
		System.out.println("Gerente:");
		System.out.println("Nome: "+g.getNome());
		System.out.println("Salario: "+g.getSalario());
		System.out.println("Usuario: "+g.getUsuario());
		System.out.println("Senha: "+g.getSenha());
		System.out.println("Bonificação: "+g.calcBonificacao());
		System.out.println("========================");
		System.out.println("Secretário(a):");
		System.out.println("Nome: "+s.getNome());
		System.out.println("Salario: "+s.getSalario());
		System.out.println("Ramal: "+s.getRamal());
		System.out.println("Bonificação: "+s.calcBonificacao());
		System.out.println("========================");
		System.out.println("Telefonista:");
		System.out.println("Nome: "+t.getNome());
		System.out.println("Salario: "+t.getSalario());
		System.out.println("Estação de trabalho: "+t.getEstacaodeTrabalho());
		System.out.println("Bonificação: "+t.calcBonificacao());
		*/
		System.out.println("===================GERENTE=====================");
		g.MostrarDados();
		System.out.println("===================TELEFONISTA=================");
		t.MostrarDados();
		System.out.println("===================SECRETÁRIA==================");
		s.MostrarDados();
		
	}

}

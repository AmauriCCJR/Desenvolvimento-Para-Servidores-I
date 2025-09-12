package Aula_110925;

public class telefonistas extends funcionarios {
	//Extends faz com que os atributos e elementos dessa classe possam ser usados com elementos de outra classe (Hierarquia)
		private int estacaodeTrabalho;

		public int getEstacaodeTrabalho() {
			return estacaodeTrabalho;
		}

		public void setEstacaodeTrabalho(int estacaodeTrabalho) {
			this.estacaodeTrabalho = estacaodeTrabalho;
		}
		
		@Override
		public void MostrarDados() {
			super.MostrarDados(); //Pega os atributos da classe "Mãe"
			System.out.println("Estação de Trabalho: "+ getEstacaodeTrabalho());
		}
		
		
}

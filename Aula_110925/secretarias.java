package Aula_110925;

public class secretarias extends funcionarios{
	//Extends faz com que os atributos e elementos dessa classe possam ser usados com elementos de outra classe (Hierarquia)
		private int ramal;

		public int getRamal() {
			return ramal;
		}

		public void setRamal(int ramal) {
			this.ramal = ramal;
		}
		
		@Override
		public void MostrarDados() {
			super.MostrarDados(); //Pega os atributos da classe "Mãe"
			System.out.println("Ramal: "+ getRamal());
		}
		
}

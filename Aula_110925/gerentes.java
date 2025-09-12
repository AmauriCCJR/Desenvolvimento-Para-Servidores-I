package Aula_110925;

public class gerentes extends funcionarios{
//Extends faz com que os atributos e elementos dessa classe possam ser usados com elementos de outra classe (Hierarquia)
	
		private String usuario;
		private String senha;
		
		
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		@Override //Declaração de que o metodo a seguir vai ter uma sobrecarga de método
		public double calcBonificacao() {
			return this.getSalario() * 0.5;
		}
		
		@Override
		public void MostrarDados() {
			super.MostrarDados(); //Pega os atributos da classe "Mãe"
			System.out.println("Usuário: "+ getUsuario());
			System.out.println("Senha: "+ getSenha());
		}
		
		
}

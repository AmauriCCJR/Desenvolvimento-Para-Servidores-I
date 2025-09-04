package Aula_030925;

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
		
		public double calcBonificacao() {
			return this.getSalario() * 0.5;
		}
		
		
}

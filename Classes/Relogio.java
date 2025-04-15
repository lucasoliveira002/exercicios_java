package atividades;

public class Relogio {
		
		//criacao dos atributos
		private Integer horas;
		private Integer minutos;
		private Integer segundos;
		
		//definindo valores de inicializacao
		public Relogio() {
			this.horas = 0;
			this.minutos = 0;
			this.segundos = 0;
			
		}
		
		//definiçao de variavel nos atributos
		public Relogio(Integer h,Integer m,Integer s) {
			this.horas = h;
			this.minutos = m;
			this.segundos = s;			
		}
		
		//gets
		public Integer getHoras() {
			return horas;
		}
		public Integer getMinutos() {
			return minutos;
		}
		public Integer getSegundos() {
			return segundos;
		}
		
		//sets
		public void setHoras(Integer horas) {
			this.horas = horas;
		}
		public void setMinutos(Integer minutos) {
			this.minutos = minutos;
		}
		public void setSegundos(Integer segundos) {
			this.segundos = segundos;
		}
		

}

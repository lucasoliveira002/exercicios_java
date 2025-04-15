package atividades;

public class Teste {
	
	
	public static void main(String args[]) {

		//TESTE RELOGIO
		Relogio r1 = new Relogio(16,20,30);
		
		System.out.println("Horario:" + r1.getHoras() + ":" + r1.getMinutos() + ":" + r1.getSegundos() );
				
		Relogio r2 = new Relogio();
		
		r2.setHoras(10);
		r2.setMinutos(50);
		r2.setSegundos(15);
		
		System.out.println("Horario:" + r2.getHoras() + ":" + r2.getMinutos() + ":" + r2.getSegundos() );
		
		
		//TESTE CANETA
		Caneta c1 = new Caneta("azul","Bic","Esfereográfica");
		
		System.out.println(" Cor: " + c1.getCor() + " Marca: " + c1.getMarca() + " Tipo: " + c1.getTipo() );
				
		Caneta c2 = new Caneta();
		
		c2.setCor("vermelha");
		c2.setMarca("Fabber Castle");
		c2.setTipo("Tinteiro");
		
		System.out.println(" Cor: " + c2.getCor() + " Marca: " + c2.getMarca() + " Tipo: " + c2.getTipo() );
		
		
		//TESTE TENIS
		Tenis t1 = new Tenis("azul","Bic",43);
		
		System.out.println(" Cor: " + t1.getCor() + " Marca: " + t1.getMarca() + " Tamanho: " + t1.getTamanho() );
				
		Tenis t2 = new Tenis();
		
		t2.setCor("vermelha");
		t2.setMarca("Fabber Castle");
		t2.setTamanho(20);
		
		System.out.println(" Cor: " + t2.getCor() + " Marca: " + t2.getMarca() + " Tamanho: " + t2.getTamanho() );
	}
}

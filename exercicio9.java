package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		ArrayList<Double> temperaturas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i<7; ++i) {
			System.out.println("Digite a temperatura dos dias da semana:");
			double temperatura = sc.nextDouble();
			temperaturas.add(temperatura);		
		}
		
		double menor = temperaturas.get(0);
		for (Double temperatura : temperaturas) {
			if (temperatura < menor) {
				menor = temperatura;
			}
		}
		
		double maior = temperaturas.get(0);
		for (Double temperatura : temperaturas) {
			if (temperatura > maior) {
				maior = temperatura;
			}
		}
		
		double soma = 0;
		for (Double temperatura : temperaturas) {
			soma += temperatura;
		}
		double media = soma / temperaturas.size();
		
		System.out.println("As temperaturas dessa semana foram:" + temperaturas);
		System.out.println("A media delas foi:" + media);
		System.out.println("A menor registrada foi:" + menor);
		System.out.println("A maior registrada foi:" + maior);	

	}
}

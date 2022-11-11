package br.com.erickfreire.medianotas;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contaNota = 0;
		int nota;
		double media;
		
		System.out.println("Programa que calcula a média de notas de alunos: ");
		System.out.print("Digite uma nota, ou digite -1 para sair:");
		nota = entrada.nextInt();
		
		while(nota != -1) {
			total = total + nota;
			contaNota = contaNota + 1;
			
			System.out.print("Digite uma nota, ou digite -1 para sair:");
			nota = entrada.nextInt();			
		}
		
		if(contaNota != 0) {
			media = (double) total / contaNota;
			
			System.out.printf("O total de %d notas inseridas é de: %d%n", contaNota, total);
			System.out.printf("A média das notas é de: %.2f%n", media);
		} else {
			System.out.println("Nenhuma nota foi inserida!");
		}

	}

}

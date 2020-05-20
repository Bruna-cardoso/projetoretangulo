package application;

import java.util.Locale;
import java.util.Scanner;

public class projetoretangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		double largura, altura;
		
		// Leitura da largura com validacao
		
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
			while (largura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
			}
			
		// Leitura da altura com validacao
		
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
			while (altura <= 0.0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
			}
		
		System.out.println();
		
		
		sc.close();

	}

}

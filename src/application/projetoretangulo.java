package application;

import java.util.Locale;
import java.util.Scanner;

public class projetoretangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		double largura, altura, area, perimetro;
		int opcao;
		
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
		
		// Programa finalizado
		
		area = largura * altura;
		perimetro = (largura + altura) * 2;
		
		System.out.println("MENU:");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opção: ");
		opcao = sc.nextInt();
		
		while (opcao == 1 || opcao == 2) {
			if (opcao == 1) {
				System.out.println();
				System.out.println("AREA = " + area);
			}
			else {
				System.out.println();
				System.out.println("PERIMETRO = " + perimetro);
			}
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			
			while (opcao > 3) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				System.out.println();
				System.out.println("MENU:");
				System.out.println("1 - Mostrar area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				System.out.print("Digite uma opção: ");
				opcao = sc.nextInt();
			}
			
			if (opcao == 3) {
				System.out.println();
				System.out.println("FIM DO PROGRAMA!");
			}
		}
		
		
		sc.close();

	}

}

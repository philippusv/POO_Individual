package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		String idade;
		String somaIdade;
		somaIdade = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Qual é a idade do colega "+ i + " ? ");
			idade = sc.next();
			somaIdade = somaIdade + idade;
			
		}
		
		System.out.println("Qual é a sua idade? ");
		idade = sc.next();
		somaIdade = somaIdade + idade;
		
		sc.close();
		
		System.out.println("O tempo de vida meu e dos meus colegas é " + somaIdade);

	}

}

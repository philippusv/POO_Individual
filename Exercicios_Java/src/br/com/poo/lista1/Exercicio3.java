package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorum;
		double valordois;
		char operacao;
		boolean continuar;
		
		do {
			System.out.println("Digite o valor um: ");
			valorum = sc.nextDouble();
			
			System.out.println("Digite a operação( +, -, /, *): ");
			operacao = sc.next().charAt(0);
			
			System.out.println("Digite o valor dois: ");
			valordois = sc.nextDouble();
			
			System.out.println("Resultado: " + realizarCalculo(valorum, valordois, operacao));
			
			continuar = verificarNovaOperacao(sc);
		}while(continuar);
		
		sc.close();
		
	}
	
	public static boolean verificarNovaOperacao(Scanner scanner) {
		System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
		String resposta = scanner.next().trim().toUpperCase();
		return resposta.equals("S");			
	}
	
	public static double realizarCalculo(double valorum, double valordois, char operacao) {
		double respostaCalculo = 0.0;
		
		switch(operacao) {
			case '+':
				respostaCalculo = valorum + valordois;
				break;
			case '-':
				respostaCalculo = valorum - valordois;
				break;
			case '/':
				respostaCalculo = valorum / valordois;
				break;
			case '*':
				respostaCalculo = valorum * valordois;
				break;
				
			default:
				System.out.println("Operação é inválida !");
		}
		
		return respostaCalculo;
	}

}

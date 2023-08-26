//pacote da aplicacao
package br.com.poo.lista1;

//lista de bibliotecas
import java.util.Scanner;

//Programa do portugol
public class Exercicio1 {

	// Funcao Inicio do portugol
	// Funcao portugol -> metodo no java
	public static void main(String[] args) {
		// declaracao de variaveis
		String nome;
		String sobrenome;
		// instancia
		Scanner sc = new Scanner(System.in);

		// funcao escreva
		System.out.print("Por favor, informe seu nome: ");
		// funcao leia
		nome = sc.nextLine();
		// utilizando do laco for para limpar a tela
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
		// funcao escreva
		System.out.print("Agora, informe seu sobrenome: ");
		// funcao leia
		sobrenome = sc.nextLine();
		// fecha Scanner apos ultima utilizacao
		sc.close();
		// utilizando do laco for para limpar a tela
		limpa();
		// funcao escreva
		System.out.println("Seja bem-vindo(a) "+nome+" "+sobrenome);
	}

	public static void limpa() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

}
//ctrl espaco no final das linhas para complemento automatico
//linha vermelha ERRO, linha amarela WARNING
//deixar o mouse por cima dos sublinhados para resolver os problemas
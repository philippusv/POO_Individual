package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double tempCelsius;
		double tempFahrenheit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Temperatura em °C: ");
		tempCelsius = sc.nextDouble();
		
		tempFahrenheit = tempCelsius * 1.8 + 32;
		System.out.println("Temperatura em °F: " + tempFahrenheit);
		sc.close();

	}

}

package br.com.poo.aula;

import java.util.Scanner;

public class TestandoCasting1 {

    public static void main(String[] args) {
       int n1;
       int n2;
       double soma;
       double div;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite o primeiro número: ");
       n1 = sc.nextInt();
       
       System.out.println("Digite o segundo número: ");
       n2 = sc.nextInt();
       
       soma = n1 + n2;
       
       System.out.println("A soma dos números é igual: " +soma);
       div = ((double) n1 / n2);
       
       System.out.println("A divisão dos números é igual a: " +div);
       sc.close();
       
       
    }
}
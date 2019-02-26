/*8 – Faça um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8). */

package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double tempF;
		double tempC;
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		tempF = Double.parseDouble(in.nextLine());
		
		tempC = (tempF - 32) / 1.8;
		
		System.out.println("Temperatura em Celsius: " + tempC);
		
		in.close();
	}

}

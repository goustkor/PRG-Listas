//2 – Faça um algoritmo para calcular a área de um cubo retangular ((h*l)+(h*b)+(l*b))*2
package br.edu.ifcvidera.Lista1;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double altura;
		double largura;
		double base;
		double area;
		
		System.out.println("Digite a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a largura: ");
		largura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a base:");
		base = Double.parseDouble(in.nextLine());
		
		area = ((altura * largura) + (altura * base) + (largura * base)) * 2;
		
		System.out.println("Área do cubo retangular: " + area);
		
		in.close();
	}
}

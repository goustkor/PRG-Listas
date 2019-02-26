/*11. Faça um programa que receba um valor qualquer, ao usuário digitar 1 converta para m²
, ao usuário digitar 2, converta para m³ */ 
package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		
		double type;
		
		System.out.println("Digite um valor em metros: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite 1 para m² \nDigite 2 para m³");
		type = Double.parseDouble(in.nextLine());
		
		if(type == 1) {
			System.out.println(Math.pow(v1, 2) + "m²");
		}else if(type == 2) {
			System.out.println(Math.pow(v1, 3) + "m³");
		}
		
		in.close();
	}

}

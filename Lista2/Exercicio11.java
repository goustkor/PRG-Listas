/*11. Fa�a um programa que receba um valor qualquer, ao usu�rio digitar 1 converta para m�
, ao usu�rio digitar 2, converta para m� */ 
package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		
		double type;
		
		System.out.println("Digite um valor em metros: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite 1 para m� \nDigite 2 para m�");
		type = Double.parseDouble(in.nextLine());
		
		if(type == 1) {
			System.out.println(Math.pow(v1, 2) + "m�");
		}else if(type == 2) {
			System.out.println(Math.pow(v1, 3) + "m�");
		}
		
		in.close();
	}

}

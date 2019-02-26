/*10.  Leia quantos gols o TIME A marcou em uma partida e leia quantos gols o 
TIME B marcou. Escrever o nome do vencedor. Caso não haja vencedor deverá 
ser impressa a palavra EMPATE. */	
package br.edu.ifcvidera.Lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double v1;
		double v2;
		
		System.out.println("Digite a quantidade de gols do  TIME 1: ");
		v1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a quantidade de gols do  TIME 2: ");
		v2 = Double.parseDouble(in.nextLine());
		
		if(v1 == v2) {
			System.out.println("Empate");
		}else if(v1 > v2) {
			System.out.println("Time 1 ganhou");
		}else {
			System.out.println("Time 2 ganhou");
		}
		
		in.close();

	}

}

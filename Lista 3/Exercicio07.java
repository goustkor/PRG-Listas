package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double tempTotal = 0;
		double tempLow = 0;
		double tempHigh = 0;
		
		int counter = 1;
		
		while(counter <= 5) {
			System.out.println("Digite a temperatura do municípios " + counter);
			double temp = Double.parseDouble(in.nextLine());
			
			tempTotal += temp;
			
			if(temp <= 10) {
				tempLow++;
			}else if(temp >= 30) {
				tempHigh++;
			}
			
			counter++;
		}
		
		System.out.println("A temperatura média é de " + tempTotal / 5);
		System.out.println(tempLow + " tem a temperatura inferior ou igual a 10°C");
		System.out.println(tempHigh + " tem a temperatura superior ou igual a 30°C");
		
		in.close();
	}

}

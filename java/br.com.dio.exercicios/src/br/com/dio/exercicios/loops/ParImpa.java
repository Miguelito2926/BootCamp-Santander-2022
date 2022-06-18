package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParImpa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int count =0;
		int numero;
		int pares =0; 
		int impares=0;
		
		System.out.println("Quantidade de números");
		quantNumeros = scan.nextInt();
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) pares++;
			else impares++;
			
			count ++;
		}while(count < quantNumeros);
		
		System.out.println("Pares "+ pares);
		System.out.println("Impares "+impares);
		
	}

}

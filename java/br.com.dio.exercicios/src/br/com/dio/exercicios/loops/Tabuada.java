package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero inteiro entre 0 a 10,
 * O usuário deve informar qual o numero ele deseja ver a tabuada, a saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x2 = 10
 * ...
 * 5 x 10 = 50
 * */

public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
					
		System.out.println("Qual tabuada deseja fazer: ");
		int tabuada = scan.nextInt();
		System.out.println("Tabuada de: "+ tabuada);
		
		
		for(int count = 1; count <= 10 ; count++) {
			System.out.println (tabuada + " x "+ count+" = "+ (tabuada * count));
			
		}
		
		

	}

}

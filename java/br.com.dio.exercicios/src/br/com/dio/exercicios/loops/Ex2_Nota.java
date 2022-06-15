package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça ima nota, entre 0 e 10, mostre uma mensagem caso o valor 
 * seja invalido e continue pedindo até que o usuário informe o valor válido*/

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nota;
		
		System.out.println("");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Digite novamente:");
			nota = scan.nextInt();
		}
		
	}

}

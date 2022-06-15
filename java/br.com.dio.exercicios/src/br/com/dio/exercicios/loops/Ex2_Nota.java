package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a ima nota, entre 0 e 10, mostre uma mensagem caso o valor 
 * seja invalido e continue pedindo at� que o usu�rio informe o valor v�lido*/

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nota;
		
		System.out.println("");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida! Digite novamente:");
			nota = scan.nextInt();
		}
		
	}

}

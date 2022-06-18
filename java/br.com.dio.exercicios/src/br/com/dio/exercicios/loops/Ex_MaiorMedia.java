package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros e informe o maior numero e a media desses numeros*/
public class Ex_MaiorMedia {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int numero;	
		int count = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero; 			
			if(numero > maior ) maior = numero;
			System.out.println("Soma de todos numero digitados  "+ soma);
			
			count ++;
		} while(count < 5);			
		
		
		
		System.out.println("O Maior é: "+ maior);

	}

}

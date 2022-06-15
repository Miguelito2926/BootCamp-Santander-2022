package br.com.dio.exercicios.loops;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representado
 * o nome do aluno e o segundo represantando a sua idade.
 * (Pare o programa inserindo 0 no campo nome)
 * */

import java.util.Scanner;

public class Ex1_NomeIdade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			if(nome.equals("0")) break;
			
			System.out.println("idade: ");
			idade = scan.nextInt();
	
		}
		
			System.out.println("Continua aqui...");
	}

}

package br.com.dio.exercicios.arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/*Faça um programa que leia 20 numeros inteiros aleatorios entre 0 e 100, e armazene-os em um vetor.
Ao final mostre os numeros e seus sucessores.
* */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios  = new  int [20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\n Sucessores dos números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero +1 + " ");
        }

    }



}

package br.com.dio.exercicios.arrays;

/*Crie um vetor de 6 números inteiros e mostre-os  na ordem inversa
*  */

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int vetor [] = {-5,0,15,50,8,4};

        System.out.print("Vetor: ");
        int count =0;

        while(count <(vetor.length)){
            System.out.print(vetor[count] +" ");
            count++;
        }

        System.out.println("\n vetor:");
    for (int i = (vetor.length-1); i >= 0; i--){
        System.out.print(vetor[i] + " ");
    }
    }

}

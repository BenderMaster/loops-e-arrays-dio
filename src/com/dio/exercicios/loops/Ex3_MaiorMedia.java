package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            count++;

            if (numero > maior) maior = numero;
        }while (count <5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma / 5));

    }
}

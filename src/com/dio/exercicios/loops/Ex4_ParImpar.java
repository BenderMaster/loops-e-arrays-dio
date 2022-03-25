package com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int QuantNumeros;
        int numero;
        int impar = 0, par = 0;

        System.out.println("Quantidade de números: ");
        QuantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            if ((numero % 2) == 0) par++; else impar++;

        }while(count < QuantNumeros);

        System.out.println("Números solicitados: " + QuantNumeros);
        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);


    }
}

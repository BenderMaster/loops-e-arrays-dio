package com.dio.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in); solicitar numeros do usuario.
        Random random = new Random();

        int[] aleatorios = new int[20];

        for (int i = 0; i < aleatorios.length; i++){
            int numero = random.nextInt(100);
            aleatorios[i] = numero;
        }


  /*    int count = 0;

        do {
            System.out.println("Digite um numero: ");
            int numero = scan.nextInt();
            aleatorios[count] = numero;

            count++;
        }while (count < aleatorios.length);*/

        for (int aleatorio : aleatorios ) {
            System.out.println("Número: " + aleatorio + " | Sucessor: " + (aleatorio+1));

        }



    }
}

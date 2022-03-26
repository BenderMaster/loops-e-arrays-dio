package com.dio.exercicios.loops;

import java.util.Random;

public class Mod2_Ex3_Arrays {
    public static void main(String[] args) {
        Random random = new Random();

    int[] idades = new int[10];
    idades[0] = 27;
    idades[1] = 31;
        System.out.println("Idade: " + idades[0]);
        System.out.println("Idade: " + idades[1]);
        System.out.println("Idade: " + idades[2]);

        System.out.println();

        int[] i = {10,25};
        System.out.println("i no 0: " + i[0]);
        System.out.println("i no 1: " + i[1]);

        System.out.println();

        idades = new int[] {12,35,45,22,9,37,52,61};

        for (int idade : idades ) {
            System.out.print("Idade: " + idade + " ");
            if (idade >= 18){
                System.out.print(": Maior de idade.\n");
            }else System.out.println();
        }

        System.out.println();

        //Matriz 3x3 jogo da velha

        char[][] jogoDaVelha = new char[3][3];

        jogoDaVelha[0][0] = 'X';
        jogoDaVelha[2][1] = 'O';
        System.out.println("Posição zero: " + jogoDaVelha[0][0]);
        System.out.println("Posição oito: " + jogoDaVelha[2][1]);

        System.out.println();

        int[][] idades_ = {{27,35},{12,19}};

        for ( int[] id1:idades_ ) {
            for (int id2 : id1) {
                System.out.print(id2 + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] randomica = new int[3][3];

        for ( int[] rd1 : randomica) {
            for (int rd2 : rd1) {
                rd2 = random.nextInt(100);
                System.out.print(rd2 + " ");
            }
            System.out.println();
        }


    }
}

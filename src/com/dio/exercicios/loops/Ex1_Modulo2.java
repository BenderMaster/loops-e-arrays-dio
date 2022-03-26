package com.dio.exercicios.loops;

public class Ex1_Modulo2 {
    public static void main(String[] args) {


        System.out.print("Exercício 1: ");
        for (int i = 3; i < 12;i = i+2){
            if (i == 7){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        while (count < 5){
            System.out.println((count + 1) + "ª vez");
            count++;
        }

    }
}

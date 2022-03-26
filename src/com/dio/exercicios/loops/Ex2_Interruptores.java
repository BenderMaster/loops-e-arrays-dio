package com.dio.exercicios.loops;

public class Ex2_Interruptores {
    public static void main(String[] args) {

        //Criar um for de 1 a 14, listando apenas multiplos de 2
        //Quando o loop passar pelo 12, abortar o mesmo

        for (int i = 1; i < 15; i++){

            if (i % 2 == 0){
                System.out.println(i + " ");
            }
            if (i == 12) break;
        }

        }

    }


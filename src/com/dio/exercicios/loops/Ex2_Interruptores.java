package com.dio.exercicios.loops;

public class Ex2_Interruptores {
    public static void main(String[] args) {

        //Criar um for de 1 a 14, listando apenas multiplos de 2
        //Quando o loop passar pelo 12, abortar o mesmo

        for (int i = 1; i <=14; i = i+2){
            System.out.print(i + " ");
            if (i == 12){
                break;
            }
        }

    }
}

package com.dio.exercicios.loops;

public class Ex2_Interruptores {
    public static void main(String[] args) {

        //Criar um for de 1 a 14, listando apenas multiplos de 2
        //Quando o loop passar pelo 12, abortar o mesmo

        for (int i = 1; i < 15; i++){

            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            if (i == 12) break;
        }

        System.out.println();
        //Faça o mesmo exemplo acima com o while

        int count = 1;

        while (count <= 14){
            if (count % 2 == 0){
                System.out.print(count + " ");
            }
            count++;
            if (count > 12) break;
        }

        }

    }


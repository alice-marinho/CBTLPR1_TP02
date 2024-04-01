/* Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de linhas para a matriz: ");
        int line = scanner.nextInt();
        while (line > 10){
            System.out.print("Erro. Digite novamente um numero para linhas ");
            line = scanner.nextInt();
        }

        System.out.print("Digite o valor de colunas para a matriz: ");
        int column = scanner.nextInt();
        while (column > 10){
            System.out.print("Erro. Digite novamente um numero para as colunas ");
            column = scanner.nextInt();
        }

        int[][] matriz = new int[line][column];

        for (int i=0; i< matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Escreva um número para armazenar na matriz: ");
                matriz[i][j] = scanner.nextInt();
            }

        System.out.print("Matriz:\n");
        for (int i=0; i< matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

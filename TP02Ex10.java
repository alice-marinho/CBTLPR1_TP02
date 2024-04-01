/* Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor de colunas e linhas, para a matriz quadrádica: ");
        int linCol = scanner.nextInt();
        while (linCol > 10){
            System.out.print("Erro. Digite novamente um numero para a matriz quadrádica:  ");
            linCol = scanner.nextInt();
        }


        int[][] matriz = new int[linCol][linCol];

        for (int i=0; i< matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Digite um número para armazenar na matriz: ");
                matriz[i][j] = scanner.nextInt();
            }

        System.out.print("Matriz:\n");
        for (int i=0; i< matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Matriz inversa:\n");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

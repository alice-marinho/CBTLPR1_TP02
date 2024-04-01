/* Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas..*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizBase = new int[3][4];
        int[][] matrizDois = new int[3][4];

        for (int i=0; i<3; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Escreva um número para armazenar na primeira matriz: ");
                matrizBase[i][j] = scanner.nextInt();
            }

        System.out.print("Digite um valor para realizar a multiplicação nos valores: ");
        int vlMulti = scanner.nextInt();

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                int numAtual = matrizBase[i][j];
                matrizDois[i][j] = numAtual * vlMulti;
            }
        }

        System.out.print("Matriz base:\n");
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizBase[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Matriz com valores multiplicados:\n");
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizDois[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

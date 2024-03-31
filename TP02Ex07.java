/* Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizBase = new int[3][4];

        for (int i=0; i<3; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Escreva um número para armazenar na matriz: ");
                matrizBase[i][j] = scanner.nextInt();
            }

        System.out.print("Matriz base:\n");
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizBase[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.print("Digite um valor para realizar a multiplicação nos valores da matriz: ");
        int vlMulti = scanner.nextInt();

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                matrizBase[i][j] *= vlMulti;
            }
        }

        System.out.print("Matriz atual:\n");
        for (int i=0; i<3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizBase[i][j] + " | ");
            }
            System.out.println();
        }


    }
}

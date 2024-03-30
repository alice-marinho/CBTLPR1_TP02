/*
Armazenar seis valores em uma matriz de ordem 2x3.
Apresentar os valores na tela.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz ={
                {2,3,4},
                {5,6,7}
        };

        for (int i=0; i < matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                System.out.print( matriz[i][j] + " | " );
            }
            System.out.println();
        }

    }
}

/*
Armazenar seis valores em uma matriz de ordem 3x2.
Apresentar os valores na tela.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] matriz ={
                {"Marina ", "Silva"},{"João ", "Marinho"}, {"Karina ", "Gomes"}
        };

        // Marina Silva
        System.out.println(matriz[0][0] + matriz[0][1]);
        // João Marinho
        System.out.println(matriz[1][0] + matriz[1][1]);
        // Karina Gomes
        System.out.println(matriz[2][0] + matriz[2][1]);
    }
}

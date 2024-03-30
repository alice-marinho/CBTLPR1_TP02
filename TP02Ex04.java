/*
Armazenar seis valores em uma matriz de ordem 2x3.
Apresentar os valores na tela.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] matriz ={
                {"Hoje ", "está ", "nublado"},
                {"Amanhã ", "estará ", "sol"}
        };

        System.out.println(matriz[0][0] + matriz[0][1] + matriz[0][2]);
        System.out.println(matriz[1][0] + matriz[1][1] + matriz[1][2]);

    }
}

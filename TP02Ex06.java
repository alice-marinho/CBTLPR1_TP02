/*
Armazenar seis nomes em uma matriz de ordem 2x3.
Apresentar os nomes na tela.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] nomes ={
                {"Maria", "João", "Alberto"},
                {"Josefa", "Roberto", "Gabriela"}
        };

        for (int i=0; i < nomes.length; i++){
            for (int j=0; j< nomes[i].length; j++){
                System.out.print( nomes[i][j] + " | " );
            }
            System.out.println();
        }

    }
}


/*
Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Novo array
        int[] numPosi = new int [10];

        // Variável para procurar o maior valor do array
        double maior = numPosi[0];

        //Váriavel da soma
        double soma = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++){
            int num = i + 1;
            System.out.print( num + ") Digite um numero: ");
            numPosi[i] = scanner.nextInt();

            while (numPosi[i]<0){
                System.out.print("Você digitou um número negativo. Digite um numero positivo para continuar: ");
                numPosi[i] = scanner.nextInt();
            }
        };

        // Declarando que o numPosi[0] é o maior, caso não seja a variável 'maior' é substituída
        for (int i=1; i < numPosi.length; i++){
            if (numPosi[i] > maior){
                maior = numPosi[i];
            }
        }
        System.out.println("Número maior: "+ maior);

        // Soma dos valores
        for(int i=0; i < numPosi.length; i++){
            soma += numPosi[i];
        }
        System.out.println("Valor da soma dos valores: " + soma);

        // Média dos valores
        double media = soma/ numPosi.length;
        System.out.println("Média dos valores: " + media);
    }
}

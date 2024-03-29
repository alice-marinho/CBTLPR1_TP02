/*
Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.
*/

import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            int qtde;
            System.out.print("Digite a quantidade de números que deseja utilizar: ");
            qtde = scanner.nextInt();
            while (qtde > 20 || qtde < 0) {
                System.out.print("Digite novamente a quantidade (entre 1 e 20): ");
                qtde = scanner.nextInt();
            }

            int[] qtdeArray = new int[qtde];
            for (int i = 0; i < qtdeArray.length; i++) {
                int id = i + 1;
                System.out.print(id + ") Digite um valor: ");
                qtdeArray[i] = scanner.nextInt();
            }

            // Maior valor
            int maior = qtdeArray[0];
            for (int i = 0; i < qtdeArray.length; i++) {
                if (qtdeArray[i] > maior) {
                    maior = qtdeArray[i];
                }
            }
            System.out.println("\nMaior valor: " + maior);

            // Menor Valor
            int menor = qtdeArray[0];
            for (int i = 0; i < qtdeArray.length; i++) {
                if (qtdeArray[i] < menor) {
                    menor = qtdeArray[i];
                }
            }
            System.out.println("Menor valor: " + menor);

            //Soma dos Valores
            double soma = 0;
            for (int i = 0; i < qtdeArray.length; i++) {
                soma += qtdeArray[i];
            }
            System.out.println("Soma dos valores: " + soma);

            //Média Aritmética
            double media = soma / qtdeArray.length;
            System.out.printf("Média aritmética: %.2f%n", media);

            //Porcentagem positivos e negativos
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < qtdeArray.length; i++) {
                if (qtdeArray[i] > 0) {
                    pos++;
                } else {
                    neg++;
                }
            }
            double total = pos + neg;
            double porcenPos = (pos / total) * 100;
            double porcenNeg = (neg / total) * 100;

            System.out.println("Porcentagem de valores positivos: " + Math.round(porcenPos) + "%");
            System.out.println("Porcentagem de valores negativos: " + Math.round(porcenNeg) + "%");

            System.out.println("Deseja fazer uma nova excusão? \nS para sim \nN para não");
            resposta= scanner.next().toUpperCase();

            while (!resposta.equals("S") && !resposta.equals("N")){
                System.out.print("Digite S para sim ou N para Não: ");
                resposta= scanner.next().toUpperCase();
            }
        } while(resposta.equals("S"));

        System.out.println("Até a próxima!");
    }
}

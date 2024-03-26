/*
Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
*/

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:");
        valor1 = scanner.nextInt();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o segundo valor:");
        valor2 = scanner.nextInt();
       
       while(valor2 >= valor1) 
        {
            System.out.print("O segundo valor e maior que o primeiro, digite um outro valor ");
            valor2 = scanner.nextInt();
        }
        System.out.printf("O primeiro valor e de " + valor1 + "\n");
        System.out.printf("O segundo valor e de " + valor2);
         
         
    }
}

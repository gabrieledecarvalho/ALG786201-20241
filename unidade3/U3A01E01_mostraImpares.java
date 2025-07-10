/*
Escreva um programa que que leia um número inteiro N, e então mostre todos os números ímpares menores ou iguais a N. Os números devem ser mostrados na mesma linha, sendo separados por espaço.
 */

// While

import java.util.Scanner;
public class U3A01E01_mostraImpares {
    // método main
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        // Mostra na tela o pedido para digitar um número inteiro maior que zero (natural)
        System.out.printf("Digite um número inteiro N, N >= 0: ");
        int n = inp.nextInt();

        // utilizando estrutura while:
        System.out.printf("While: \n");
        int i = 1; // declara i inteiro, que será o contador:
        while(i <= n){ // enquanto i for menor ou igual a n, imprime i, i varia de 1 até n, sendo i ímpar, já que i = i + 2, e i(inicial) = 1:
            System.out.printf("%d ", i);
            i += 2;
        }

        // utilizando estrutura for
        System.out.printf("\nFor: \n");
        for(int i=1;i<=n;i+=2){
            System.out.printf("%d ", i);
        }
    }
}
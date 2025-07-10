// Escreva um programa que que leia um número inteiro N, e então mostre todos os números pares menores ou iguais a N. Os números devem ser mostrados na mesma linha, sendo separados por espaço.

import java.util.Scanner;
public class U3A01E02_mostraPares {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite um número inteiro N, N >= 0: ");
        int n = inp.nextInt();

        // utilizando estrutura while
        System.out.printf("While: \n");
        int i = 1;
        while(i <= n){
            System.out.printf("%d ", i);
            i += 2;
        }
    }
}
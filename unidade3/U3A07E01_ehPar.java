/*
Escreva um programa que leia um número do teclado e informe se esse número é par ou ímpar.

Seu programa deve mostrar uma mensagem na tela pedindo que se digite o
 número a ser verificado, e em seguida deve ler esse número. Ao final,
ele deve mostrar apenas uma destas duas mensagens na tela, dependendo se
 o número for par ou ímpar:

- *x* PAR
- *x* IMPAR

... sendo *x* o número que foi lido.

Para verificar se um número é par, escreva este método, e então utilize-o no algoritmo principal:

static boolean ehPar(int x) {
  // retorna true se "x" for par
}
 */

// não pode declarar um método dentro de outro

import java.util.Scanner;

class U3A07E01_ehPar {

    static boolean ehPar(int x){ // utilizar mais boolean nos meus programas
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite um número para saber se é par ou ímpar: ");
        int numero = inp.nextInt();

        if(ehPar(numero)){
            System.out.printf("Par\n");
        }else{
            System.out.printf("Ímpar\n");
        }
    }
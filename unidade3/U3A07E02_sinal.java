/*
Escreva um programa que leia um número do teclado e informe se esse número é negativo, positivo, ou zero.

Seu programa deve mostrar uma mensagem na tela pedindo que se digite o
 número a ser verificado, e em seguida deve ler esse número. Ao final,
ele deve mostrar apenas uma destas três mensagens na tela, dependendo do
 valor do número:

- POSITIVO
- NEGATIVO
- ZERO

Para verificar o sinal de um número, escreva este método, e então utilize-o no algoritmo principal:

static int sinal(int x) {
  // retorna 1 se "x" for positivo, 0 se for zero, e -1 se for negativo
}
 */

import java.util.Scanner;

class U3A07E02_sinal {

    // algoritmo abaixo deixa o método mais geral:
    static int sinal(int x){
        if(x==0){
            return 0;
        }else if(x>0){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.printf("Número: ");
        int numero = inp.nextInt();

        switch(sinal(numero)){
            case 1:
                System.out.print("POSITIVO");
                break;
            case -1:
                System.out.print("NEGATIVO");
                break;
            case 0:
                System.out.print("ZERO");
                break;
        }

        // System.out.print(sinal(numero));

    }
}
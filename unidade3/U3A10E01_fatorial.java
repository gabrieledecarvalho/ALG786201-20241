/*
O fatorial de um número é o produto de todos números menores o iguais a ele, e maiores que 1. A operação fatorial de um número é representada por esse número seguido de um sinal exclamação. Por exemplo, veja o fatorial de 5:

5! = 5x4x3x2 = 120
O cálculo de fatorial pode ser feito de forma recursiva da seguinte forma:

N! = N.(N-1)!
O caso base é quando N = 1, quando então !N = 1. Por definição, 0! também é 1.

Escreva um programa que calcule o fatorial de um número lido do teclado. O cálculo do fatorial deve ser feito de forma recursiva com este método:

static int fatorial(int N) {
  // calcula o fatorial de N, e retorna o valor calculado
}
 */

import java.util.Scanner;

class U3A10E01_fatorial {
    static int fatorial (int N){
        if(N>0) { // poderia até ser maior que 1, porque tanto 0! quando 1! é igual a 1
            return N * fatorial(N - 1);
        }
        return 1; // else retorna 1
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("n para calculo do fatorial: ");
        int n = inp.nextInt();

        System.out.printf("O fatorial de %d é %d.\n",n, fatorial(n));
    }
}
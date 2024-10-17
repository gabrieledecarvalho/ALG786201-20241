/*  U2A03E04: calculando a sequência de Fibonacci
    A famosa sequência de Fibonacci é uma sequência de números em que o 
    próximo número é dado pelasoma dos dois números que o precedem.

    Como explicado em seu verbete da wikipedia:
    "Em termos matemáticos, a sequência é definida recursivamente pela fórmula abaixo,
    sendo o primeiro termo F0= 0:
        Fn = F_(n-1) + F_(n-2),
    ... e valores iniciais:
        F0 = 0, F1 = 1."
        Escreva um programa que mostre os 10 primeiros números da sequência de Fibonacci. 
        Seu programa deve calcular cada número da sequência, então ele não pode simplesmente 
        mostrar números calculados previamente ! Os números devem ser mostrados na mesma linha, 
        sendo separados por espaço.
 */

//  Solução U2A03E04:
public class U2A03E04_fibonacciV1 {
    public static void main(String[] args){
        //  calculando e guardando cada número da sequência em uma variável diferente:
        int f0 = 0, f1 = 1, f2, f3, f4, f5, f6, f7, f8, f9;
        System.out.printf("f0 = %d, ",f0);
        System.out.printf("f1 = %d, ",f1);
        f2 = f0 + f1;
        System.out.printf("f2 = %d, ",f2);
        f3 = f2 + f1;
        System.out.printf("f3 = %d, ",f3);
        f4 = f3 + f2;
        System.out.printf("f4 = %d, ",f4);
        f5 = f4 + f3;
        System.out.printf("f5 = %d, ",f5);
        f6 = f5 + f4;
        System.out.printf("f6 = %d, ",f6);
        f7 = f6 + f5;
        System.out.printf("f7 = %d, ",f7);
        f8 = f7 + f6;
        System.out.printf("f8 = %d, ",f8);
        f9 = f8 + f7;
        System.out.printf("f9 = %d.",f9);
    }
}
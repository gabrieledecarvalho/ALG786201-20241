/*  U2A04E02 - Debug: Calculando a média N-1 de uma sequência de números
    Escreva um programa que calcule a média N-1 de cinco números inteiros. 
    Quer dizer, ela deve desconsiderar o valor mais baixo dentre os 5 números. 
    Os números devem ser informados via teclado.
    Seu programa deve mostrar uma mensagem na tela pedindo que se digitem os cinco
    números separados por espaços, e em seguida deve ler os cinco números. 
    Em seguida, ele deve mostrar a média N-1 desses números.
    Duas funções que podem ser úteis:
        Math.max(x, y): tem como resultado o maior valor dentre x e y
        Math.min(x, y): tem como resultado o menor valor dentre x e y
*/

import java.util.Scanner;

public class U2A04E02_debug2 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5, min;
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite 5 números separados por espaço: ");
        n1 = inp.nextDouble();
        n2 = inp.nextDouble();
        n3 = inp.nextDouble();
        n4 = inp.nextDouble();
        n5 = inp.nextDouble();
        
        min = Math.min(n1,n2);
        min = Math.min(min,n3);
        min = Math.min(min,n4);
        min = Math.min(min,n5);

        System.out.printf("A média é %.2f",(n1 + n2 + n3 + n4 + n5 - min)/4);        
    }
}
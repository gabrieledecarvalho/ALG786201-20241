/* U2A01E06 - Cálculo da média de 5 números
Escreva um programa que calcule a média de cinco números inteiros. 
Note que a média pode ter parte fracionária ! Os números devem ser informados via teclado.
Seu programa deve mostrar uma mensagem na tela pedindo que se digitem os cinco números separados por espaços,
e em seguida deve ler os cinco números. Em seguida, ele deve mostrar a média desses números.
*/

import java.util.Scanner;

public class U2A01E06_mediaCincoNumeros {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);//Inp é input mas pode dar o nome de qualquer coias pro scanner
        int x1, x2, x3, x4, x5;

        System.out.println("Digite os 5 números separados por espaço: ");
        x1 = inp.nextInt();
        x2 = inp.nextInt();
        x3 = inp.nextInt();
        x4 = inp.nextInt();
        x5 = inp.nextInt();
        System.out.printf("Media: %.2g\n", (x1+x2+x4+x4+x5)/5.0); 
        // se colocar %g é double, exige que seja nesse formato ponto 
        //flutuante; com o %d ele vai truncar, deixar só o número inteiro
        //outra possibilidade é: double soma = x1 + x2 + x3 + x4 + x5; System.out.printf("Media: %g\n", soma/5);
    }
}
// int x; double soma = 0; soma += leitor.nextInt(); (5 vezes); System.out.printf("Media: %g\n", soma/5);

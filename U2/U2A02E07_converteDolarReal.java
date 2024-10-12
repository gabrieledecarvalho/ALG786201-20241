/*  U2A02E07 - Conversor de dólar para real
    Escreva um programa que converta um valor de dólar para real. Esse programa deve ler do teclado:
    - A cotação do dólar
    - O valor em dólares
    ... e então fazer a conversão, apresentando o resultado na tela.

    Seu programa deve mostrar uma mensagem na tela pedindo a cotação do dólar, 
    e em seguida deve ler o valor dessa cotação. 
    Depois deve mostrar uma mensagem pedindo o valor a ser convertido, e ler esse valor. 
    Ao final, ele deve mostrar o valor convertido para reais.
 */

// Solução U2A02E07:
import java.util.Scanner;

public class U2A02E07_converteDolarReal {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //  definindo duas variáveis em ponto flutuante
        double cot, dol;
        System.out.println("Programa de conversão de Dólar para Real:"); // intro do programa
        
        //  printa o pedido e em seguida pede o dado do teclado:
        System.out.print("Qual a cotação do dólar? ");
        cot = input.nextDouble();

        System.out.print("Qual o valor em dólares? ");
        dol = input.nextDouble();
        
        //  imprime o dado na tela formatado com duas casa após da vírgula:
        System.out.printf("O valor em real é de %.2f.",cot*dol);
    }
}
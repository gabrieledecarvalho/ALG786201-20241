/*  U2A02E06 - Cálculo da média de 5 números
    Escreva um programa que calcule a média de cinco números inteiros. 
    Note que a média pode ter parte fracionária ! Os números devem ser informados via teclado.
    Seu programa deve mostrar uma mensagem na tela pedindo que se digitem os cinco números separados por espaços,
    e em seguida deve ler os cinco números. Em seguida, ele deve mostrar a média desses números.
*/

//  Solução U2A02E06:
import java.util.Scanner;

public class U2A02E06_mediaCincoNumeros {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); // inp é de input mas pode dar o nome de qualquer coias pro scanner
        
        //  definindo as variáveis inteiras
        int x1, x2, x3, x4, x5;
        
        //  imprimindo na tela o pedido para digitar os números e o formato
        System.out.println("Digite os 5 números inteiros separados por espaço: ");
        
        //  chamando o scanner inp, lendo do teclado o inteiro e guardando em xn:
        x1 = inp.nextInt();
        x2 = inp.nextInt();
        x3 = inp.nextInt();
        x4 = inp.nextInt();
        x5 = inp.nextInt();
        
        //  mostrando na tela que a média é um valor, calculando o valor direto no printf
        System.out.printf("Media: %.2f\n", (x1+x2+x3+x4+x5)/5.0); 
        /*  %f ponto flutuante, podendo formatar quantas casas, exemplo .2f é duas casas após o ponto/vírgula; 
            %d: ele vai truncar, deixar só o número inteiro
        */
        /*  outra forma de mostrar os dados na tela é:
            double soma = x1 + x2 + x3 + x4 + x5;  
            System.out.printf("Media: %g\n", soma/5);
            ou
            int x; 
            double soma = 0; 
            soma += leitor.nextInt(); (5 vezes); 
            System.out.printf("Media: %g\n", soma/5);
        */
    }
}


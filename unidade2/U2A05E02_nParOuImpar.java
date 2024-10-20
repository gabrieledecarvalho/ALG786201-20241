/*  U2A05E02 - É par ou ímpar?
    Escreva um programa que leia um número do teclado e informe se esse número é par ou ímpar.

    Seu programa deve mostrar uma mensagem na tela pedindo que se digite o número a ser verificado, 
    e em seguida deve ler esse número. Ao final, ele deve mostrar apenas uma destas duas mensagens na tela, dependendo se o número for par ou ímpar:
        x PAR
        x IMPAR
    ... sendo x o número que foi lido.
 */

//  Solução U2A05E02:
import java.util.Scanner;

public class U2A05E02_nParOuImpar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //  declarando variável numero do tipo inteiro:
        int numero;
        
        //  mostrando na tela o que deve ser digitado:
        System.out.print("Digite um número para saber se é par ou ímpar: ");
        
        //  chamando o scanner inp para ler o input do teclado e guardando na variável numero
        numero = inp.nextInt();

        //  primeiro teste: se o resto da divisão inteira do numero por 2 for igual a zero (divisível por 2), mostra na tela "PAR"
        if (numero%2 == 0) {
            System.out.print("PAR");
        
            //  caso o teste acima retorne False, mostra na tela "ÍMPAR"
        } else {
            System.out.print("ÍMPAR");
        }
    }
}
/*
Escreva um programa que leia uma frase, e então mostre sua quantidade
 de palavras. O programa deve presumir que as palavras estão delimitadas
 por espaço.

- Se houver mais de um espaço entre duas palavras, os espaços em excesso devem ser ignorados
- O mesmo vale para espaços em excesso no início e no final da frase

Seu programa deve mostrar uma mensagem na tela para instruir o
usuário sobre o que digitar, antes de ler a linha. Ao final, ele deve
mostrar a quantidade de palavras
 */

import java.util.Scanner;
public class U3A06E01_contaPalavras {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        String f1 = inp.nextLine();

        String f2 = f1.strip(); // removendo espaços no início e fim da frase
        String[] palavras = f2.split(" +"); // padrão a ser procurado: expressões regulares

        System.out.printf("%d",palavras.length);
    }
}
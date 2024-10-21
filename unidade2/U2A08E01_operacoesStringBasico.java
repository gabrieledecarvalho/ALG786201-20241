/*  U2A08E01 - Operações básicas com String
    Faça um programa que, a partir de uma string digitada pelo usuário, 
    imprima nesta sequência:
        O número de caracteres da string
        A string com todas as letras em maiúsculo
        Se a string inicia com "IF" (ignorando a diferença entre maiúsculas e minúsculas)
        Se a string termina com "SC" (ignorando a diferença entre maiúsculas e minúsculas)
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, 
    antes de ler a string.
 */

//  Solução U2A08E01:
import java.util.Scanner;
//  a string não é uma variável, a string é um objeto!
public class U2A08E01_operacoesStringBasico {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String s = inp.next();
        
        //  número de caracteres da string/length - comprimento da string
        System.out.printf("-> A string %s tem %d caracteres !\n", s, s.length()); //abrir e fechar parenteses indica que é um método/função?
        
        //a string com todas as letras em maiúsculo
        String maiuscula = s.toUpperCase();
        System.out.printf("-> A string %s toda em maiúcula: %s\n", s, maiuscula);
        
        //  se a string inicia com IF (ignorando a diferença entre maiúsculas e minúsculas)
        if (s.startsWith("IF")||s.startsWith("if")) {
            System.out.printf("-> A String %s inicia com IF/if\n", s);
        }
        
        //  se a string termina com SC (ignorando a diferença entre maiúsculas e minúsculas)
        if (s.endsWith("SC")||s.endsWith("sc")) {
            System.out.printf("-> A String %s termina com SC/sc\n", s);
        }
        //  tanto para os testes de maiúsculas ou minúsculas eu posso transformar tudo em maiúsculo e testar somente se é maiúsculo
    }
}
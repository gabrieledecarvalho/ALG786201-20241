/*
Uma empresa produz um painel onde mensagens de texto são apresentadas. O painel tem um tamanho limitado, e nele cabe somente uma linha de texto composta por, no máximo, 12 caracteres. As mensagens a serem apresentadas são deslizadas da esquerda para a direita, uma letra por vez.

        Escreva um programa que mostre uma frase num painel como esse. Seu programa deve ler a frase a ser digitada pelo usuário, e então apresentá-la repetidamente, deslizando-a um caractere para a esquerda por vez. O programa deve mostrar a sequência de telas a ser apresentada no painel, como neste exemplo:


        ### IMPORTANTE:

        Para que a resolução desta questão atinja nota máxima, seu programa deve atender estes critérios:

        1. Passar em todos os testes automáticos fornecidos:
        2. Ter explorado o uso de laços (repetição), como estudado na unidade 3

*/
import java.util.Scanner;

// recebe frase inteira
// inicia o primeiro caractere da frase recebida na ultima posição da tela (11)
// desloca o caractere para a posição 10, e recebe o segundo caractere na posição 11 (i = 0, j = 11)
// ...
// quando a tela estiver cheia, remove o caracter da posição 0 e adiciona o próximo caractere na posiao 11 (quando j for menor que zero)
// final da frase

class Teste {
    static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String frase = inp.nextLine();

        String tela = "            ";
        int tamanhoTela = tela.length();
        for (int i = 0; i < frase.length();i++){
            tela = tela.substring(1,tamanhoTela-1) + frase.charAt(i); // verificar se substring é intervalo fechado e intervalo aberto
            if(i==frase.length()){ // quando a frase inteira foi mostrada na tela
                for(int j = tamanhoTela-1;j<0;j++){
                    tela = tela.substring(0,j) + " ";
                    System.out.printf(tela);
                }
                break;
            }
            System.out.print(tela);
        }
    }
}

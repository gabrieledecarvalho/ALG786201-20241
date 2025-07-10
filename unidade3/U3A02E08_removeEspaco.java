/*
Escreva um programa que leia uma frase contendo um número arbitrário de palavras, e então a modifique de forma a remover todos os espaços em excesso. Isso significa que:

- Não deve haver espaços nas bordas
- Deve haver somente um espaço entre palavras

Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha. Ao final, ele deve mostrar a linha modificada.
 */

import java.util.Scanner;
public class removeEspaco {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        String fraseOriginal = inp.nextLine();
        String frase = fraseOriginal.trim();
        String fraseNova = "";

        while(true){
            int espaco = frase.indexOf(" ");
            if(espaco == -1){
                break;
            }
            String palavra = frase.substring(0,espaco+1);
            frase = frase.substring(espaco+1);
            frase = frase.trim();

            fraseNova = fraseNova + palavra;

        }
        System.out.printf("%s\n",fraseNova + frase);
    }
}
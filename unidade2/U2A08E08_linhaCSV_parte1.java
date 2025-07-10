/*  U2A08E08 - Extraindo uma informação de uma linha CSV
    Uma linha no formato CSV (Comma Separated Values - Valores Separados por Vírgulas) é usada para representar uma linha de uma tabela. 
    Nesse formato, as colunas estão separadas por vírgulas. Por exemplo,  cada linha da seguinte tabela ...

        | CPF          | Nome                | Idade | 
        | ------------ | ------------------- | ----- |
        | 234567789-98 | Joaquim José Xavier | 32    |
        | 556677889-00 | Francisca da Silva  | 47    |
        | 424258583-67 | Antonieta de Barros | 51    | 
        
    ... ficaria assim em CSV:
        CPF,Nome,Idade
        234567789-98,Joaquim José Xavier,32
        556677889-00,Francisca da Silva,47
        424258583-67,Antonieta de Barros,51

    Escreva um programa que leia uma linha no formato CSV, e então faça o seguinte:
        Se a primeira coluna tiver o valor "OK", a linha toda deve ser mostrada na tela
        Caso contrário, seu programa deve mostrar o seguinte (col1 deve ser o valor contido na primeira coluna da linha):
            REJEITADA: col1
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha.
 */

//  Solução U2A08E08:

import java.util.Scanner;
public class REVER_U2A08E08_linhaCSV {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite a linha no formato CSV: \n");
        String linha = inp.nextLine();
        
        if (linha.startsWith("OK")){ // ?????
            System.out.print(linha);
        } else{
            System.out.print("REJEITADA: Col1");
        }
    }
}
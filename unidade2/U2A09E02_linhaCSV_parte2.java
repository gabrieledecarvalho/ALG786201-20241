/*  U2A09E02: Modificar última coluna de uma linha em formato CSV
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
    
    Escreva um programa que leia uma linha no formato CSV, e então modifique a última coluna para que fique em maiúsculas. 
    Ao final, seu programa deve mostrar a linha atualizada na tela;
    Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha.
*/

//  Solução U2A09E02:

import java.util.Scanner;

public class U2A09E02_linhaCSV_parte2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite a linha no formato CSV: \n");
        String linha = inp.nextLine();

        //  utilizando o lastIndexOf para encontrar a posição da última vírgula na string linha
        int ultima_virgula = linha.lastIndexOf(",");
        //  utilizando substring para separar o conteúdo da string antes da vírgula e o depois da vírgula,
        String inicio_linha = linha.substring(0,ultima_virgula+1);//    substring entre os dois números, intervalo aberto no segundo valor
        String final_linha = linha.substring(ultima_virgula+1); // substring a partir do número, intervalo fechado, incluindo o número

        //  formatando a coluna final, colocando tudo em maiúsculo:
        final_linha = final_linha.toUpperCase();

        //  concatenando as substrings criadas anteriormente, criando a linha formatada:
        linha = inicio_linha + final_linha;
        //  seria melhor criar outra variável, e gravar o conteúdo da concatenação nesta nova variável

        System.out.printf("%s",linha);
    }
}
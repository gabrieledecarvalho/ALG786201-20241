/*  U2A09E03 - Gerar texto a partir de formulário
    Escreva um programa que gere um texto a partir de um formulário. Seu programa deve ter um texto de formulário incorporado, 
    com informações a serem substituídas. Um formulário é composto por um texto incompleto, com parâmetros correspondendo a valores a serem preenchidos. 
    O formulário em questão tem este conteúdo:

        $cidade, $data
        Caro $aluno, você foi aprovado em $disciplina !
        Em um formulário, os parâmetros estão prefixados por $ (ex: $aluno).
    
        Seu programa deve ler o valor de cada um desses parâmetros. 
    Ao final, ele deve mostrar o texto gerado a partir da substituição desses valores no formulário.
    Por exemplo, se seu programa ler os seguintes valores para cada parâmetro:
        cidade: São José
        data: 12/07/2024
        aluno: Maneca Zezinho
        disciplina: ALG
    ... o resultado seria este texto:

        São José, 12/07/2024

        Caro Maneca Zezinho, você foi aprovado em ALG !

*/

//  Solução U2A09E03:

import java.util.Scanner;

public class U2A09E03_textoFormulario {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        String texto, texto2, cidade, data, aluno, disciplina;

        //  criando o texto que será apresentado com as informações fornecidas no formulário:
        texto = "$cidade, $data\n\nCaro $aluno, você foi aprovado em $disciplina !";

        System.out.print("Digite a Cidade: ");
        cidade = inp.nextLine();

        System.out.print("Digite a Data: ");
        data = inp.nextLine();

        System.out.print("Digite o Nome: ");
        aluno = inp.nextLine();

        System.out.print("Digite a Disciplina: ");
        disciplina = inp.nextLine();

        //  utilizando o replace para substituir os termos existentes na primeira String texto com os dados fornecidos pelo usuário:
        texto = texto.replace("$cidade", cidade);
        texto = texto.replace("$data", data);
        texto = texto.replace("$aluno", aluno);
        texto = texto.replace("$disciplina", disciplina);

        //  seria interessante, como já observei em outros programas, que as Strings modificadas fossem guardadas por mim em variáveis diferentes, novas
        System.out.printf(texto);
    }
}
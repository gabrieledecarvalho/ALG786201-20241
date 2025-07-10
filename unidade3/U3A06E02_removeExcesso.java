/*
Escreva um programa que leia uma frase, e então a modifique de forma a remover todos os espaços em excesso. Isso significa que:

- Não deve haver espaços nas bordas
- Deve haver somente um espaço entre palavras

Seu programa deve mostrar uma mensagem na tela para instruir o
usuário sobre o que digitar, antes de ler a linha. Ao final, ele deve
mostrar a linha modificada.

**IMPORTANTE**: as novas operações de String podem ajudar e muito a escrever este programa. Pense em como pode combinar [*split* e *String.join*](https://moodle.ifsc.edu.br/mod/page/view.php?id=155416) para simplificar a solução ... além, é claro, de [*strip*](https://moodle.ifsc.edu.br/mod/page/view.php?id=144545&forceview=1).
 */

import java.util.Scanner;
public class U3A06E02_removeExcesso {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        String f1 = inp.nextLine();

        String f2 = f1.strip(); // removendo espaços no início e fim da frase
        String[] palavras = f2.split(" +"); // padrão a ser procurado: expressões regulares - ele aceita o caracter anterior como padrão
        String f3 = String.join(" ", palavras);

        System.out.prinln(palavras);
    }
}
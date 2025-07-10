/*
Uma linha no formato CSV (Comma Separated Values - Valores Separados por Vírgulas) é usada para representar uma sequência de valores, os quais são delimitados por vírgulas. Por exemplo, a seguinte linha no formato CSV contém três valores:

234567789-98,Joaquim José Xavier,32
Escreva um programa que leia as notas de uma turma, as quais são digitadas pelo usuário em uma linha no formato CSV, e então mostre o seguinte na tela:

A média da turma
A menor nota
A maior nota
Essas informações devem ser apresentadas da seguinte forma:

média/menor/maior
Note que a quantidade de notas é variável !

Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha.

IMPORTANTE: seu programa deve explorar o uso de laços de repetição, e operações de String.

Dica: lembre que, para converter para um número inteiro uma string que possui somente dígitos numéricos, pode-se usar o método Integer.valueOf:

String valor = "123";

// a variável "x" terá o número 123 após a execução da linha a seguir
int x = Integer.valueOf(valor);
 */

import java.util.Scanner;

public class U3A08Teste10 {
    // início método converte_linha
    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);
        int[] numeros = new int[v.length];
        for (int j=0;j<numeros.length;j++) {
            numeros[j] = Integer.valueOf(v[j]);
        }
        return numeros;
    }//fim

//    // início método max -> não está funcionando
//    static int max(int numeros, int tamanho){
//        int maximo = numeros[0];
//        for(int j=0;j<tamanho;j++){
//            if(numeros[j]>maximo){
//                maximo = numeros[j];
//            }
//        }
//        return maximo;
//    }//fim
//
//    // inicio método min -> não está funcionando.
//    static int min(int numeros, int tamanho){
//        int minimo = numeros[0];
//        for(int j=0;j<tamanho;j++){
//            if(numeros[j]<minimo) {
//                minimo = numeros[j];
//            }
//        }
//        return minimo;
//    }// fim

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String notasOriginal = inp.nextLine();
        String notas = notasOriginal.strip();

        // chamando método converte_linha:
        int notasInteiro[] = converte_linha(notas,",");

        // início média das notas:
        double soma=0;
        for(int i=0;i<notasInteiro.length;i++){
            soma=notasInteiro[i];
        }
        double media = soma/notasInteiro.length;
        // fim média das notas.

        int maior = notasInteiro[0];
        for(int j=0;j<notasInteiro.length;j++) {
            if (notasInteiro[j] > maior) {
                maior = notasInteiro[j];
            }
        }
        int menor = notasInteiro[0];
        for(int j=0;j<notasInteiro.length;j++) {
            if (notasInteiro[j] < menor) {
                menor = notasInteiro[j];
            }
        }
        // chamando os métodos max e min: não funcionaram
//        int maior = max(notasInteiro);
//        int menor = min(notasInteiro);

        System.out.printf("%.2f/%.2f/%.2f",media,maior,menor);

    }
}

/*
O programa está quase correto, pois ele não calcula a média das notas. Isso aconteceu porque cada nota foi atribuída à variável "soma", ao invés de ser somada a ela.
Uma melhoria que poderia ser feita no programa é usar somente um laço para atualizar "som", "maior" e "menor".
 */
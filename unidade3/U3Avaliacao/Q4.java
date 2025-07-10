/*Uma necessidade em alguns programas é embaralhar um conjunto de valores (isso se chama também de *randomizar*). Por exemplo, o treinamento de redes neurais artificiais funciona melhor se o conjunto de dados para treinamento for embaralhado a cada rodada. Por isso, pode ser útil um algoritmo que embaralhe um vetor.

        Existe mais de um algoritmo conhecido para realizar o embaralhamento de um vetor. Um deles é o algoritmo de Durstenfeld, que funciona da seguinte maneira:


// embaralha o vetor v, sendo n o comprimento desse vetor
        para i de n-1 até 1 faça
        j <- número inteiro aleatório tal que 0 <= j <= i
        faz a permuta de v[j] e v[i]


        Sendo assim, faça o seguinte:

        1. Implemente esse algoritmo em um método. Note que o algoritmo não gera uma cópia do vetor a ser embaralhado !
        2. Escreva um programa que leia alguns números do teclado, e mostre-os
        embaralhados. Os números são digitados na mesma linha e delimitados por
        vírgula

        Um exemplo de execução do seu programa é este:

        ```java
        Digite os números: 1,2,3,4,5,6,7,8
        5 1 3 8 6 2 7 4
        ```

        **DICA:**

        Para sortear um número inteiro, use um gerador de números aleatórios:


// cria um gerador de números aleatórios ... basta criar um único gerador !
        Random gerador = new Random();

// gera um número inteiro com valor no intervalo [2, 10)
// Após a linha a seguir, a variável x terá um valor 2 <= x < 10
        int x = gerador.nextInt(2, 10)

// gera um número no intervalo [0, 5)
        int y = gerador.nextInt(0, 5);


        **IMPORTANTE:**

        - Você não pode usar nenhum método existente que porventura embaralhe vetores ou sequências de valores (ou algo parecido)

        ---

*/

// swap the vector
import java.util.Random;
import java.util.Scanner;

class Teste {
    static void embaralha(int[] vetor){
        Random rand = new Random; // sorteia um número aleatório
        for(int i=vetor.length-1;i>0;i--){ // i>0 é como se fosse i==0, atentar-se a isso
            int j = rand.nextInt(0,i+1); // 0 é intervalo fechado, i+1 por que o intervalo é aberto, 0 por que é a primeira posição do vetor
            int aux = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = aux;
        }
    }

    public static void main(String[] args){
        int[] v = {1,2,3,4,5}
        embaralha(v):
        for(int x: v){
            System.out.printf("%s ",x); //x é o valor do v, não é um contador!
        }
        System.out.println();
    }
}
```

/*

Avaliação:
O seu programa deveria fazer o seguinte:
        **implementar um método que embaralhasse um vetor usando o algoritmo de Durstenfeld (PARCIAL)
Escrever um programa que demonstrasse o funcionamento desse método (CORRETO)**
O método "embaralha_vetor" quase conseguiu implementar o algoritmo de Durstenfeld. O erro está na especificação do laço com for, na linha 10, na condição de continuidade. Há um erro também ao gerar um inteiro aleatório ... o primeiro parâmetro deve ser 0 (\ero)Seu programa precisaria de mínimas alterações para funcionar.


import java.util.Random;
import java.util.Scanner;

public class Teste {
    static int [] embaralha_vetor(int[] v){
        Random gerador = new Random();
        int tamanho = v.length;
        for(int i = tamanho-1; i==0;i--){
            int j = gerador.nextInt(1,i); // gera um número aleatório entre 1 e i
            int aux = v[j]; // variável auxiliar para não perder o valor do v[j]
            // trocando as variáveis de lugar:
            v[j] = v[i];
            v[i] = aux;
        }
        return v;
    }
    static int[] converte_linha(String l, String delim) {
        String[] v = l.split(delim);
        int[] n = new int[v.length];
        for (int j = 0; j < v.length; j++) {
            n[j] = Integer.valueOf(v[j]);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite os números: ");
        String numeros = inp.nextLine();
        int [] nInt = converte_linha(numeros, " ");
        int [] nIntEmbaralhado = embaralha_vetor(nInt);

        for (int i = 0; i < nInt.length; i++) {
            System.out.printf("%d ", nIntEmbaralhado[i]);
        }
    }
}

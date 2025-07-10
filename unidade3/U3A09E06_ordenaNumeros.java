/*
Um programa obtém uma quantidade de números digitados pelo usuário e, ao final, mostra os números em ordem crescente. Por exemplo, se forem digitados estes números:

2 4 10 1 9
... o programa irá mostrar isto (o programa pode mostrar os números na mesma linha, ou um por linha):

1 2 4 9 10
O usuário deve digitar todos os números em uma mesma linha. O programa então lê esses números, e em seguida mostra-os ordenados. O programa pode mostrar os números em uma mesma linha, separados por espaços, ou um número por linha.

Para ler uma quantidade incerta de números
Seu programa precisa converter para um vetor de números a sequência de números digitados. Sabendo que os números digitados estão numa mesma linha, essa conversão pode ser facilitada. A ideia é fazer o seguinte:

Ler uma linha do teclado usando o método getLine() do Scanner
Usar o método split de String para transformar a linha digitada em um vetor de String, no qual cada posição contém uma string de dígitos numéricos
Converter cada string numérica obtida no passo 2, e armazenar os resultados em um vetor de inteiros
Essa conversão como um todo ficaria muito bem em um método específico ! Ele poderia ser declarado assim:

static int[] converte_linha(String linha) {
  // converte a "linha" para um vetor de inteiros
  // retorna o vetor gerado
}
Algoritmo de ordenamento
Existem muitos algoritmos de ordenamento, e um dos mais simples é o ordenamento por seleção. Ele usa esta abordagem:

Identifica o menor valor a partir da 1a posição da lista e coloca-o na 1a posição
Identifica o menor valor a partir da 2a posição da lista e coloca-o na 2a posição
Identifica o menor valor a partir da 3a posição da lista e coloca-o na 3a posição
Identifica o menor valor a partir da n-ésima posição da lista e coloca-o na n-ésima posição
Veja esta simulação desse algoritmo.

Esse algoritmo poderia ser implementado em um método, cujo algoritmo está de acordo com este pseudo-código:

j = primeira posição do vetor
enquanto j < tamanho do vetor - 1
  menor = j
  k = posição j+1
  enquanto k < tamanho do vetor
    se valor na posição k < valor na posição menor então menor = k
  fim enquanto
  troca valores das posições j e menor
fim enquanto
Esse método poderia ser declarado assim:

static void ordena(int[] numeros) {
  // ordena o vetor de números
  // não precisa retornar um resultado, pois o vetor passado como parâmetro é
  // modificado diretamente !
 */

// import java.util.Arrays;
// Array.sort(vetor);

import java.util.Scanner;

public class U3A09E06_ordenaNumeros {

    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);

        int[] n = new int[v.length];
        for(int i=0;i<v.length;i++) {
            n[i] = Integer.valueOf(v[i]);
        }
        return n;
    }

    // verifica se o vetor está ordenado:
    // static boolean ordenado(int[] numeros) { // double or int ?
    //     for(int j=0; j<numeros.length-1; j++) { //numeros.length-1 nunca vai testar o ultimo, mas usa o ultimo como teste
    //         if(numeros[j] > numeros[j+1]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    static int [] ordena_vetor(int[] v){
        int tamanho = v.length;
        for(int j=0;j<tamanho;j++) {
            for(int k=j+1;k<tamanho;k++){
                if(v[k]<v[j]){
                    int menor = v[k];
                    v[k] = v[j];
                    v[j]=menor;
                }
            }
        }
        return v;
    }


    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("números: ");
        String numerosOriginal = inp.nextLine();
        String numeros = numerosOriginal.strip();

        int [] nDesordenados = converte_linha(numeros," ");

        int [] nOrdenados = ordena_vetor(nDesordenados);

        for(int i=0; i<nOrdenados.length;i++){
            System.out.printf("%d ",nOrdenados[i]);
        }
    }
}
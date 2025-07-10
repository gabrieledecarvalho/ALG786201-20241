/*
Escreva um programa que leia as notas dos testes de uma unidade de
ALG, supondo que foram realizados 7 testes. Em seguida, ele deve mostrar
 os pesos a serem usados no cálculo da média ponderada da unidade.

De acordo com o plano de ensino, os pesos são calculados desta forma:

W1=5+min(5, max(0, N−2−k))

W2=5−min(5, max(0, N−2−k))

Apenas a título de informação, a média da unidade é calculada assim:

A=(W1.P + W2.T)/10

... sendo A a média ponderada da unidade, P a nota da prova, e T a média N-2 dos testes.

Seu programa deve ler as notas dos testes, as quais são informadas em
 uma linha no formato CSV (valores separados por vírgulas), e então
calcular os pesos W1 e W2. Ao final, ele deve mostrar na tela os valores calculados desses pesos. Veja um exemplo de execução do programa:

```
Notas: 7,6,4,0,1
W1=6
W2=4
```

As funções *max* e *min* usadas nas fórmulas dos pesos deve ser escritas como dois métodos, os quais devem então ser utilizados no algoritmo principal:
static int max(int x1, int x2) {
  // retorna o maior valor dentre "x1" e "x2"
}

static int min(int x1, int x2) {
  // retorna o menor valor dentre "x1" e "x2"
}
 */
 */

import java.util.Scanner;
class U3A07AE03_maxMin {

    // método converte_linha, Sting para Inteiro - início
    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);

        int[] numeros = new int[v.length];

        for(int j=0;j<v.length;j++) {
            numeros[j]=Integer.valueOf(v[j]);
        }

        return numeros;
    }
    // método converte_linha, String para Inteiro - fim

    // método máximo entre dois números - início
    static int max(int x1, int x2){
        if(x1>x2){
            return x1;
        }else{
            return x2;
        }
    }
    // método máximo entre dois números - início

    // método mínimo entre dois números:
    static int min(int x1, int x2){
        if(x1<x1){
            return x1;
        }else{
            return x2;
        }
    }

    //método main
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Notas: ");
        String linha = inp.nextLine();

        int notas[] = converte_linha(linha,",");

        // verificando quantos testes foram aprovados
        int k=0;

        for(int i=0;i<notas.length;i++) {
            if (notas[aprovado]>=6) {
                k++;
            }
        }

        int N = notas.length; // não preciso declarar esta variável, posso colocar no N direto na formula.
        double w1 = 5+min(5,max(0,N-2-k));

        double w2 = 5-min(5,max(0,N-2-k));

        System.out.printf("Notas: %d\nW1=%.2f\nW2=%.2f",notas,w1,w2);

    }
}
}
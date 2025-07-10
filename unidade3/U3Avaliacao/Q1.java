/*
Um analista de dados precisa identificar qual o primeiro valor de um conjunto que é maior que a média desse conjunto. Com isso, ele pode estimar a distância entre a média e o subconjunto dos valores maiores que ela.

Escreva um programa que obtenha um conjunto de números a ser digitado pelo usuário, e mostre qual o menor valor desse conjunto é maior do que a média do mesmo conjunto. O cálculo da média deve ser feito por um método que você deve definir em seu programa (**e você não pode usar nenhum método já existente da linguagem Java que calcule média**).
 O usuário deve digitar todos os números na mesma linha, delimitados por espaço. Ao final, o programa deve mostrar o número encontrado. Caso não
 encontre o número, o programa deve mostrar a string *NaN.*

Um exemplo de execução do programa é este:

```java
Digite os números: 4 5 2 7 8 6 10 8 3 5
6

```

E um exemplo de execução em que não há um número maior que a média pode ser visto a seguir:

```java
Digite os números: 7 7 7 7 7 7 7 7 7 7
NaN

```

### Sumário do que você deve entregar:

- Um programa que funcione conforme descrito neste enunciado
- Esse programa deve conter um método para calcular a média de um conjunto de números

### Código sem ordenar o vetor:

```java
double menorMaiorMedia = media;
for(x: vetor){
	if(x > media || x < menorMaiorMedia){
		menorMaiorMedia = x;
	}
	if(menorMaiorMedia=media){
		System.out.printf("NaN\n");
	}else{
		System.out.printf("%.2f\n",menorMaiorMedia);
	}
}
```
 */

import java.util.Scanner;
public class Q1 {

    // método que calcula a média números contido sem um vetor, pedido na questão
    static double calcula_media(int [] n){
        double soma = 0;
        int tamanho = n.length;
        for(int i=0;i<tamanho;i++){
            soma+=n[i];
        }
        return (soma/tamanho);
    }

    // método converte linha String em vetor Inteiros, método auxiliar
    static int[] converte_linha(String l, String delim) {
        String[] v = l.split(delim);
        int[] n = new int[v.length];
        for (int j = 0; j < v.length; j++) {
            n[j] = Integer.valueOf(v[j]);
        }
        return n;
    }

    // método ordena vetor, método auxiliar
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

    // início método main
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("numeros separados por espaço: ");
        String nString = inp.nextLine();

        // usando o método para retornar vetor inteiros:
        int [] nInt = converte_linha(nString," ");

        int tamanhoN = nInt.length;
        double media = calcula_media(nInt);
        // ordenando o vetor:
        int [] nIntOrdenado = ordena_vetor(nInt);
        for(int i=0;i<tamanhoN;i++){
            if(nInt[i]>media) {
                System.out.printf("%d\n", nInt[i]);
                return;
            }
        }
        System.out.printf("NaN\n");
    }
}

/*Sua solução foi engenhosa: a sacada de ordenar o vetor de números
facilitou o algoritmo para encontrar o menor número que é maior que a
média. Porém, a rigor, procurar esse valor sem ordenar o vetor pode ser
melhor, do ponto de vista de tempo de execução - isso é uma questão que
você estudará na 3a fase ;-)*/


/*
import java.util.Scanner;

// recebe frase inteira
// inicia o primeiro caractere da frase recebida na ultima posição da tela (11)
// desloca o caractere para a posição 10, e recebe o segundo caractere na posição 11 (i = 0, j = 11)
// ...
// quando a tela estiver cheia, remove o caracter da posição 0 e adiciona o próximo caractere na posiao 11 (quando j for menor que zero)
// final da frase

class Teste {
    static void main(String[] args){
        Scanner inp = new Scanner([System.in](http://system.in/));
        String frase = inp.nextLine();

```
        String tela = "            ";
        int tamanhoTela = tela.length();
        for (int i = 0; i < frase.length();i++){
            tela = tela.substring(1,tamanhoTela-1) + frase.charAt(i);
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

```

}

import java.util.Scanner;

// recebe frase inteira
// inicia o primeiro caractere da frase recebida na ultima posição da tela (11)
// desloca o caractere para a posição 10, e recebe o segundo caractere na posição 11 (i = 0, j = 11)
// ...
// quando a tela estiver cheia, remove o caracter da posição 0 e adiciona o próximo caractere na posiao 11 (quando j for menor que zero)
// final da frase

class Teste {
    static void main(String[] args){
        Scanner inp = new Scanner([System.in](http://system.in/));
        String frase = inp.nextLine();
        String tela = "            ";
        int tamanhoTela = tela.length();
        for (int i = 0; i < frase.length();i++){
            tela = tela.substring(1,tamanhoTela-1) + frase.charAt(i);
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
*/
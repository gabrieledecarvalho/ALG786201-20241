/*
Um computador de bordo de um veleiro possui um cronômetro que conta o
 tempo decorrido a partir do momento em que ele é zerado e iniciado.
Quando o marinheiro quer ver a duração atual da viagem, ele aperta um
botão, e o computador de bordo mostra o valor do cronômetro da seguinte
forma:

```
DD:HH:MM:SS
```

... sendo DD a quantidade de dias completos, e HH MM SS o horário que
 corresponde à fração do dia mais recente da viagem. Esse tempo é
contado a partir do início da viagem.

Imagine que o marinheiro tenha lido o cronômetro em dois instantes
importantes da viagem, e queira saber quanto tempo decorreu entre essas
duas leituras. Você deve escrever um programa que resolva essa
necessidade do marinheiro. Seu programa deve obter as seguintes
informações do marinheiro:

1. O valor do cronômetro para o primeiro instante
2. O valor do cronômetro para o segundo instante

Para cada um desses valores a ser lido, uma mensagem na tela deve ser
 apresentada para instruir o marinheiro sobre o que digitar, e então
deve ler o valor correspondente. Ao final, ele deve fazer os cálculos
para determinar quanto tempo decorreu entre o primeiro e o segundo valor
 do cronômetro, e apresentá-lo na tela. O valor a ser apresentado deve
estar neste formato:

```
DD HH:MM:SS
```

Por exemplo, se os dois instantes forem:

```
01:10:05:20
02:11:06:01
```

... o programa deve mostrar o seguinte resultado:

```
01 01:00:41
```

**DICA**:

1. Crie um método para converter um valor de cronômetro para quantidades de segundos
2. Crie outro método para converter uma quantidade de segundos para o formato de horário a ser apresentado
 */

import java.util.Scanner;
class U3A08E04_calculaTempo {

    // método que retorna a conversão de uma String escrita em linha [nextLine()] em um vetor de inteiros
    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador); // recebe a string
        // cria um vetor do tamanho da string
        int[] numeros = new int[v.length];
        // laço para transformar o valor da string em inteiro e guardar no vetor novo
        for(int i=0;i<v.length;i++) {
            numeros[i] = Integer.valueOf(v[i]);
        }
        // retorna o vetor de inteiros
        return numeros;
    }

    // método que retorna a conversão de um horário formatado [String,DD:HH:MM:SS] em total de segundos
    static int converte_segundos(String tempo){
        int [] tempoInteiro = converte_linha(tempo,":");
        int segundos = tempoInteiro[0]*86400 + tempoInteiro[1]*3600 + tempoInteiro[2]*60 + tempoInteiro[3];
        return segundos;
    }

    // método que retorna a conversão de um total de segundos em um horário formatado [DD HH:MM:SS]
    static String converte_horario_formatado (int segundos){
        // da pra fazer um for : ?
        int [] horario = new int[4];
        horario[0] = segundos/86400;
        segundos %= 86400;
        horario[1] = segundos/3600;
        segundos %= 3600;
        horario[2] = segundos/60;
        horario[3] = segundos%60;

        // retorna a string como se fosse o print mas sem printf:
        return String.format("%02d %02d:%02d:%02d\n",horario[0],horario[1],horario[2],horario[3]);
    }

    // método main
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Primeiro instante: ");
        String cr1 = inp.nextLine();
        System.out.printf("Segundo instante: ");
        String cr2= inp.nextLine();

        // chama o método converte_segundos para os dois instantes e calcula os segundos passados
        int segundosPassados=converte_segundos(cr2)-converte_segundos(cr1);

        // imprime na tela o tempo passado formatado [DD HH:MM:SS]
        System.out.print(converte_horario_formatado(segundosPassados));

    }
}
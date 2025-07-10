/*
Um computador de bordo de um veleiro possui um cronômetro que conta o
 tempo decorrido a partir do momento em que ele é zerado e iniciado.
Quando o marinheiro quer ver a duração atual da viagem, ele aperta um
botão, e o computador de bordo mostra o valor do cronômetro da seguinte
forma:

```
DD HH MM SS
```

... sendo DD a quantidade de dias completos, e HH MM SS o horário que
 corresponde à fração do dia mais recente da viagem. Esse tempo é
contado a partir do início da viagem.

Imagine que o marinheiro deseje converter o cronômetro em uma
quantidade de segundos decorridos desde o início da viagem. Você deve
escrever um programa que resolva essa necessidade do marinheiro..

Seu programa deve apresentar uma mensagem na tela para instruir o
marinheiro sobre o que digitar, e então deve ler o valor correspondente.
 Ao final, ele deve apresentar a quantidade de segundos correspondente.

 */

import java.util.Scanner;
public class U3A06E04_converteHorario {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite a duração da viagem [DD HH MM SS]: ");

        String duracaoOriginal = inp.nextLine();
        String duracao = duracaoOriginal.strip();

        // separando a string pelo separados " ", tempo[0] = DD; tempo[1] = HH; tempo[2] = MM; tempo[3]= SS
        String[] tempo = f2.split(" ");

        // criando vetor de inteiros para alocar a conversao da string para inteiros
        int[] tempoInteiro = new int[4];

        for(j=0;j<tempo.length;j++){
            tempoInteiro[j]=Integer.valueOf(tempo[j]);
        }

        // ver se dá para fazer um laço com a prox linha:
        int segundos = v[0]*86400 + v[1]*3600 + v[2]*60 + v[3];
        System.out.printf("%d",segundos);
    }
}
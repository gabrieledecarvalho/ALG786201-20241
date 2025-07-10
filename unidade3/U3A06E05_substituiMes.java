/*
Um programa precisa converter uma data deste formato (DD, MM e AAAA são números para dia, mês e ano):

```
DD/MM/AAAA
```

... para este outro formato (mmm é formado pelas três primeiras letras do mês):

```
mmm DD AAAA
```

Escreva um programa que leia uma data no formato *DD/MM/AAAA*, e então a converta para uma data no formato *mmm DD AAAA*, apressentando-a na tela.

Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a data.
 */

import java.util.Scanner;
// MODIFICAR:
public class U3A06E05_substituiMes {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Data: ");
        String dataOriginal = inp.next();
        String data = dataOriginal.strip();

        String dataVetor = data.split("/");

        String [] dataVetor2 = new String [3];
        dataVetor2[1]=dataVetor[0];

        int[] dataInteiro = new int[3];

        for(j=0;j<dataVetor.length;j++){
            dataInteiro[j]=Integer.valueOf(dataVetor[j]);
        }

        switch(dataInteiro[1]){
            case 01:
                dataVetor2[0]="jan";
                break;
            case 02:
                dataVetor2[0]="fev";
                break;
            case 03:
                v[0]="mar";
                break;
            case 04:
                v[0]="abr";
                break;
            case 05:
                v[0]="mai";
                break;
            case 06:
                v[0]="jun";
                break;
            case 07:
                v[0]="jul";
                break;
            case 08:
                v[0]="ago";
                break;
            case 09:
                v[0]="set";
                break;
            case 10:
                v[0]="out";
                break;
            case 11:
                v[0]="nov";
                break;
            case 12:
                v[0]="dez";
                break;
        }

        String dataFinal = String.join(" ",dataVetor2);

        System.out.printf("%s",dataFinal);
    }
}
/*
Escreva um programa que verifica a validade de um horário lido do
teclado. A validade de um horário significa que ele está no seguinte
formato:

```
HH:MM:SS
```

... sendo que HH é a hora, MM são os minutos, e SS são os segundos, e
 todos devem ser formados por dígitos numéricos.Além disso, todos podem
ter um ou dois dígitos. O valor de minutos e segundos deve estar entre 0
 e 59, e hora deve estar entre 0 e 23.

Se o horário for válido, seu programa deve apresentar o próprio valor
 do horário na tela, da forma como foi informado. Se o horário for
inválido, ele deve apresentar o seguinte:

Horario inválido
 */

import java.util.Scanner;

public class U3A06E06_verificaHorario {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("horario: ");
        String horarioOriginal = inp.nextLine();
        String[] horario = horarioOriginal.split(":");

        int[] horarioInteiro = new int[2];
        for(int j=0;j<horario.length;j++){

            horarioInteiro[j]=Integer.valueOf(horario[j]);
        }

        if(horarioInteiro[0]<24 && horarioInteiro[0]>=0 && horarioInteiro[1]<60 && horarioInteiro[1]>=0 && horarioInteiro[2]<60 && horarioInteiro[2]>=0){
            System.out.printf("%s",horarioOriginal);
            return;
        }
        System.out.printf("horario invalido");

    }
}
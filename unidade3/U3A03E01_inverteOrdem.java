/*
Um programa obtém 5 números digitados pelo usuário e, ao final, mostra os números em ordem inversa a que foram lidos. Por exemplo, se forem digitados estes números:

```
2 4 1 9 10
```

... o programa irá mostrar isto (o programa pode mostrar os números na mesma linha, ou um por linha):

```
10 9 1 4 2
```

O usuário deve digitar todos os números em uma mesma linha. O programa então lê esses números, e em seguida mostra-os em ordem inversa a que foram digitados. O programa pode mostrar os números em uma mesma linha, separados por espaços, ou um número por linha.
 */

import java.util.Scanner;

public class U3A03E01_inverteOrdem {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int n = 0;
        int v[] = new int[5];

        while(n < 5){
            System.out.printf("Digite o %d número: ",n+1);
            v[n] = inp.nextInt();
            n++;
        }

        int i = 0;
        int w[] = new int[5];

        while(i < 5){
            w[i] = v[n];
            n--;
            i++;
        }

        System.out.printf("%d", w);

        int u[] = new int[5];

        for(int i=0; i<5;i++){
            u[i] = v[n];
            n--;
        }

        System.out.printf("%d", u);
    }
}
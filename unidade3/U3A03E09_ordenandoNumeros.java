/*
Um programa obtém 5 números digitados pelo usuário e, ao final, mostra os números em ordem crescente. Por exemplo, se forem digitados estes números:

```
2 4 10 1 9
```

... o programa irá mostrar isto (o programa pode mostrar os números na mesma linha, ou um por linha):

```
1 2 4 9 10
```

O usuário deve digitar todos os números em uma mesma linha. O programa então lê esses números, e em seguida mostra-os ordenados. O programa pode mostrar os números em uma mesma linha, separados por espaços, ou um número por linha.

### **Algoritmo de ordenamento**

Existem muitos algoritmos de ordenamento, e um dos mais simples é o ordenamento por seleção. Ele usa esta abordagem:

- Identifica o menor valor a partir da 1a posição da lista e coloca-o na 1a posição
- Identifica o menor valor a partir da 2a posição da lista e coloca-o na 2a posição
- Identifica o menor valor a partir da 3a posição da lista e coloca-o na 3a posição
- Identifica o menor valor a partir da n-ésima posição da lista e coloca-o na n-ésima posição

Veja[esta simulação](http://liveexample.pearsoncmg.com/liang/animation/web/SelectionSort.html)desse algoritmo.

Esse algoritmo poderia ser implementado de acordo com este pseudo-código:

j = primeira posição do vetor
enquanto j < tamanho do vetor - 1
  menor = j
  k = posição j+1
  enquanto k < tamanho do vetor
    se valor na posição k < valor na posição menor então menor = k
  fim enquanto
  troca valores das posições j e menor
fim enquanto
 */
import java.util.Scanner;
public class U3A03E09_ordenandoNumeros {

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite 5 números: \n");

        int [] v = new int[5];
        v[0] = inp.nextInt();

        int i=1;
        while(i<5){
            if(inp.hasNextInt()){
                v[i] = inp.nextInt();
            }
            i++;
        }

        int j=0;
        while(j<5){
            int k = j+1;
            while(k<5){
                if(v[k]<v[j]){
                    int menor = v[k];
                    v[k]=v[j];
                    v[j]=menor;
                }
                k++;
            }
            System.out.printf("%d ",v[j]);
            j++;
        }

    }
}
/*
Escreva um programa em Java que solicita 10 números ao usuário, usando um laço while, e ao final mostre o seguinte:

- O maior número
- O menor número
- A média dos números

Esses três valores devem ser mostrados da seguinte forma:

```
Resultado: maior/menor/media
```
 */

import java.util.Scanner;
public class U3A02E03_maiorMenorMedia {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite 10 números: \n");
        System.out.printf("n1: ");
        double nMaior = inp.nextDouble();
        double nMenor = nMaior;
        double soma = nMaior;

        // while:
        int i = 0;
        while(i<9){
            System.out.printf("n%d: ", i+2);
            double n = inp.nextDouble();

            soma+=n;

            if(n>nMaior){
                nMaior = n;
            }else if(n<nMenor){
                nMenor = n;
            }
            i++;
        }
        System.out.printf("Resultado: maior: %.2f, menor: %.2f, média: %.2f", nMaior, nMenor, soma/10.0);

        // for:
        for (int i = 0; i<9;i++){
            System.out.printf("n%d: ", i+2);
            double n = inp.nextDouble();
            soma+=n;
            if(n>nMaior){
                nMaior = n;
            }else if(n<nMenor){
                nMenor = n;
            }
        }
        System.out.printf("Resultado: maior: %.2f, menor: %.2f, média: %.2f", nMaior, nMenor, soma/10.0);
    }
}
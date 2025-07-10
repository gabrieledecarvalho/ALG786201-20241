/*Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.

Por exemplo, se o lado for igual a 5, seu programa deve mostrar isto:

```
 *****
 *****
 *****
 *****
 *****
```
 */

import java.util.Scanner;
public class U3A02E05_quadradoAsteriscos {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("Lado do quadrado: \n");
        int n = inp.nextInt();

        int i=0;
        while(i<n){
            int j=0;
            while(j<n){
                System.out.printf("*");
                j++;
            }

            System.out.printf("\n");
            i++;
        }
    }
}
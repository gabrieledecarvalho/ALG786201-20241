/*
FizzBuzz é uma brincadeira matemática e de programação muito comum em entrevistas de emprego para programadores. A ideia básica do jogo é contar de 1 a N, e quando um número é múltiplo de 3, em vez de dizer o número, deve-se dizer "Fizz". Se um número é múltiplo de 5, deve-se dizer "Buzz". Se o número é múltiplo tanto de 3 como de 5, deve-se dizer "FizzBuzz".

Por exemplo, os primeiros números da sequência seriam:

```java
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 ...
```

Escreva um programa que leia um número inteiro N do teclado, e então mostre a sequência de números de 1 até N, mas seguindo as regras do FizzBuzz. A sequência a ser apresentada deve estar toda na mesma linha, com números separados por espaço.
 */
import java.util.Scanner;

public class U3A01E03_fizzBuzz {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        //mostrando na tela a mensagem para o usuário digitar
        System.out.printf("Digite um número inteiro N: ");
        int n = inp.nextInt(); //limite superior do while

        // utilizando estrutura while:
        System.out.printf("While: \n");
        int i = 1; //limite inferior do while
        while(i <= n){ //enquanto i não for igual a N, o laço continua
            if(i % 3 == 0 && i % 5 == 0){ //se i for multiplo de 3 e de 5 ao mesmo tempo, poderia fazer i%15
                System.out.print("FizzBuzz ");
            }else if(i % 3 == 0){ //se i for multiplo de 3 somente, como é um else if, não será testado se o primeiro for verdadeiro
                System.out.print("Fizz ");
            }else if(i % 5 == 0){ //se i for multiplo de 5 somente, hierarquia if, elseif
                System.out.print("Buzz ");
            }else{
                System.out.printf("%d ", i); //se nenhum dos ifs acima forem verdadeiros, printa só o valor de i
            }
            //incremento do i, i = i + 1, i += 1
            i++;
        }

        // exemplo do professor ema aula:
        // while(i <= n){
        //     boolean div3 = i % 3 == 0;
        //     boolean div5 = i % 5 == 0;

        //     if (div3 && div5){
        //         System.out.print("FizzBuzz");
        //     }else if (div3){
        //         System.out.print("Fizz");
        //     }else if (div5){
        //         System.out.print("Buzz");
        //     }else{
        //         System.out.print(i);
        //     }
        //     x++
        // }
    }
}
}
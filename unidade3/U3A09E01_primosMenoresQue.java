/*
Um **número primo** é um [número natural](https://pt.wikipedia.org/wiki/N%C3%BAmero_natural) maior que 1 que não pode ser formado pela multiplicação de outros dois naturais menores. Um método simples, mas lento, de verificar a  primalidade de um número dado *n*, chamado de divisão tentativa, testa se *n* é um múltiplo de qualquer inteiro entre 2 e $\sqrt{n}$. (FONTE: [wikipedia](https://pt.wikipedia.org/wiki/N%C3%BAmero_primo))

Escreva um programa que mostre todos os números primos menores que um determinado número, o qual deve ser digitado pelo usuário. Os números primos devem ser mostrados na tela (um por linha). Após o último número primo apresentado, seu programa deve mostrar também quantos números primos foram encontrados. Veja este exemplo de execução do programa:

```
Digite um número: 30
2
3
5
7
11
13
17
19
23
29
Quantidade de primos: 10
```

Para verificar se um número específico é primo, crie um *método*. Ele pode ser declarado assim:

static boolean verifica_primo(int x) {
  // algoritmo para verificar se x é primo
  // retorna true, caso seja primo, e false se não for
}
 */

// verificar:
import java.util.Scanner;
class U3A09E01_primosMenoresQue {

    static boolean verifica_primo(int x) {
        if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else {
            var lim = Math.sqrt(x);
            for (int i = 3; i <= lim; i += 2) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int numero = inp.nextInt();

        int total = 0;
        for (int j = 2; j<numero; j++) {
            if (verifica_primo(j)) {
                total++;
                System.out.printf("%d\n", j);
            }
        }
        System.out.printf("Quantidade de primos: %d.\n", total);
    }
}
/*
Escreva um programa que leia uma sequência de números, e mostre o
maior dentre eles. Os números devem ser digitados todos numa mesma
linha.

Seu programa deve ter um método que obtém o maior valor de um vetor de números. Esse método pode ser declarado assim:

```
static int maior(int[] numeros) {
  // retorna o maior número contido no vetor "numeros"
}
```

### Para ler uma quantidade incerta de números

Seu programa precisa converter para um vetor de números a sequência
de números digitados. Sabendo que os números digitados estão numa mesma
linha, essa conversão pode ser facilitada. A ideia é fazer o seguinte:

1. Ler uma linha do teclado usando o método next*Line*() do Scanner
2. Usar o método *split* de String para transformar a linha digitada em um vetor de String, no qual cada posição contém uma string de dígitos numéricos
3. Converter cada string numérica obtida no passo 2, e armazenar os resultados em um vetor de inteiros

Essa conversão como um todo ficaria muito bem em um método específico ! Ele poderia ser declarado assim:

static int[] converte_linha(String linha) {
  // converte a "linha" para um vetor de inteiros
  // retorna o vetor gerado
}
 */

// testar:
import java.util.Scanner;
class U3A08E02_maiorDoConjunto {

    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);

        int[] numeros = new int[v.length];
        for(int i=0;i<v.length;i++) {
            numeros[i] = Integer.valueOf(v[i]);
        }
        return numeros;
    }

    static int maior(int[] numeros){
        int maior = numeros[0];
        for(int j=0;j<numeros.length;j++){
            if(numeros[j]>maior){
                maior = numeros[j];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite os números: ");
        String numeros = inp.nextLine();

        int[] linhaInteiro = converte_linha(numeros," ");

        System.out.printf("Maior: %.2d.",maior(linhaInteiro));

    }
}
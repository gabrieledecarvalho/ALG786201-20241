/*
Escreva um programa que lê um conjunto de números a partir do
teclado, e verifica se essa sequência de números, conforme foi digitada,
 está ordenada em ordem crescente.

Seu programa deve mostrar alguma mensagem pedindo a sequência de
números, os quais devem ser digitados na mesma linha, separados por
espaços. Em seguida, seu programa deve ler os números digitados, e então
 verificar se estão ordenados. Ao final, seu programa deve mostrar o
seguinte na tela, dependendo do resultado da verificação:

- ORDENADOS
- DESORDENADOS

Se a sequência tiver um único número, ou estiver vazia, o resultado deve ser ORDENADOS.

Seu programa deve ter um **método** para verificar se um vetor de números está ordenado. Esse método pode estar declarado assim:

```
static boolean ordenado(double[] numeros) {
  // retorna true se o vetor "numeros" estiver ordenado
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

```
static int[] converte_linha(String linha) {
  // converte a "linha" para um vetor de inteiros
  // retorna o vetor gerado
}
```
 */

// testar:
import java.util.Scanner;
class U3A08E03_sequenciaEstaOrdenada {

    // método converte_linha, recebe uma string e converte para um vetor de inteiros
    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);

        int[] numeros = new int[v.length];
        for(int i=0;i<v.length;i++) {
            numeros[i] = Integer.valueOf(v[i]);
        }
        return numeros;
    }

    //método ordenado, verifica se a sequencia de números está ordenada, length > 1 -> fazer para caso length == 0 ou 1;
    static boolean ordenado(int[] numeros) { // double or int ?
        for(int j=0; j<numeros.length-1; j++) { //numeros.length-1 nunca vai testar o ultimo, mas usa o ultimo como teste
            if(numeros[j] > numeros[j+1]) {
                return false;
            }
        }
        return true;
    }

    //método main
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite uma sequência de números: ");
        String linha = inp.nextLine();
        if(linha.length() == 0 || linha.length() == 1) {
            System.out.println("ORDENADOS");
            return;
        }

        int[] linhaInteiro = converte_linha(linha," ");
        if(ordenado(linhaInteiro)){ //true
            System.out.println("ORDENADOS");
        }else{
            System.out.println("DESORDENADOS");
        }

    }
}
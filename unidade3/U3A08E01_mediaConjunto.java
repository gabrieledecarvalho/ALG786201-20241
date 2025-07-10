/*
Escreva um programa que leia as notas das avaliações de uma turma, e calcule a média. Esse programa deve fazer o seguinte:

1. Pedir ao usuário que informe as notas. Elas devem ser informadas todas numa mesma linha e separadas por espaço
2. Calcular a média aritmética
3. Mostrar o resultado na tela com até duas casas decimais

Seu programa deve ter um método que calcula a média de um vetor de números. Esse método pode ser declarado assim:

```
static double calcula_media(int[] numeros) {
  // calcula a média dos números contidos no vetor
  // retorna a média calculada
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

// TESTAR
import java.util.Scanner;
class U3A08E01_mediaConjunto {

    static int[] converte_linha(String linha, String delimitador) {
        String[] v = linha.split(delimitador);

        int[] inteiros = new int[v.length];

        for(int i=0; i<v.length;i++) {
            inteiros[i] = Integer.valueOf(v[i]);
        }
        return inteiros;
    }

    static double calcula_media(int[] numeros) {
        double media=0;
        for(int j=0;j<numeros.length;j++){
            media+=numeros[j];
        }
        media = media/numeros.length;
        return media;
    }

    // método main
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Digite as notas: ");
        String numeros = inp.nextLine();

        int[] linhaInteiro = converte_linha(numeros," ");
        double media = calcula_media(linhaInteiro);

        System.out.printf("media %.2f.", media);

    }
}
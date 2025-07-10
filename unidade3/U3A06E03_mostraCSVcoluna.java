/*
Uma linha no formato [CSV](https://pt.wikipedia.org/wiki/Comma-separated_values) (*Comma Separated Values - Valores Separados por Vírgulas*)
 é usada para representar uma linha de uma tabela. Nesse formato, as
colunas estão separadas por vírgulas. Por exemplo,  cada linha da
seguinte tabela ...

| CPF | Nome | Idade |
| --- | --- | --- |
| 234567789-98 | Joaquim José Xavier | 32 |
| 556677889-00 | Francisca da Silva | 47 |
| 424258583-67 | Antonieta de Barros | 51 |

... ficaria assim em CSV:

```
CPF,Nome,Idade
234567789-98,Joaquim José Xavier,32
556677889-00,Francisca da Silva,47
424258583-67,Antonieta de Barros,51
```

Escreva um programa que leia uma linha no formato *CSV*, e
então mostre os valores de cada coluna sucessivamente. O valor de cada
coluna deve ser mostrado em uma linha (deve haver uma quebra de linha
após cada valor apresentado).

Seu programa deve mostrar uma mensagem na tela para instruir o usuário sobre o que digitar, antes de ler a linha.
 */
import java.util.Scanner;

public class U3A06E03_mostraCSVcoluna {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        // formato csv: CPF,Nome,Idade
        System.out.printf("frase em formato CSV: ");
        String csvOriginal = inp.nextLine();
        String csv = csvOriginal.strip();
        String[] dados = csv.split(",");
        String coluna = String.join("\n", dados);

        System.out.printf("%s\n",coluna);
    }
}
/*
Escreva um programa que verifica a validade de uma data lida do
teclado. A validade de uma data significa que ela está no seguinte
formato:

```
DD/MM/AAAA
```

... sendo que DD é o dia, MM é o mês, e AAAA é o ano, e todos devem
ser formados por dígitos numéricos. Além disso, com exceção do ano, o
qual deve ter quatro dígitos, todos podem ter um ou dois dígitos. O
valor do dia deve ser consistente com o mês. No caso do mês de
fevereiro, a quantidade de dias deve considerar se o ano é bissexto.

Se a data for válida, seu programa deve apresentar a própria data na
tela, da forma como foi informada. Se a data for inválida, ele deve
apresentar o seguinte:

data invalida
 */

import java.util.Scanner;

public class U3A06E07_verificaData {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.printf("data: ");
        String dataOriginal = inp.nextLine();
        String[] data = dataOriginal.split("/");

        //verificar cannot find symbol:
        if(data[0].length>2||data[0].length<1||data[1].length>2||data[1].length<1||!data[2].length==4){
            System.out.print("data invalida");
            return;
        }
        System.out.printf("%s",dataOriginal);
    }
}
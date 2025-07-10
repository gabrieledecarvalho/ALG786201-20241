/*
Escreva um programa que leia o nome de uma contato de uma pessoa, e o apresente neste formato:

```
Joaquim Silva Xavier
Rua dos Inconfidentes, 1789
Vila Rica, Minas Gerais
```

O programa deve ler cada parte desse contato:

- Nome completo
- Rua
- Número
- Cidade
- Estado

Cada uma dessas informações precisa ser ajustada antes de ser
apresentada na tela, para certificar que suas iniciais estejam em
maiúsculas.

Crie um método para fazer esse ajuste. Esse método pode ser declarado assim:

static String ajusta_iniciais(String texto) {
  // retorna o valore de "texto" ajustado para que suas iniciais esteja em maiúscula
}
 */

import java.util.Scanner;
class U3A09E03_iniciaisMaiusculas {

    // melhorar e verificar::::::::::::
    static String ajusta_iniciais(String texto){
        String[] v = linha.split(" ");
        String[] w = new String[v.length];

        for(int i=0;i<v.length;i++){
            if(v[i].equals("da")||v[i].equals("de")||||v[i].equals("do")v[i].equals("das")||v[i].equals("des")||v[i].equals("dos")){
                w[i]= v[i].toLowerCase();
            }else{
                String primeiraLetra = v[i].substring(0,1);
                String restoNome = v[i].substring(1,espaco+1);
                w[i]= primeiraLetra.toUpperCase()+restoNome;
            }
        }
        String textoFinal = String.join(" ",w);

        return textoFinal;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Nome completo: ");
        String nome = inp.nextLine();
        System.out.printf("Rua: ");
        String rua = inp.nextLine();
        System.out.printf("Número: ");
        int numero = inp.nextInt();
        System.out.printf("Cidade: ");
        String cidade = inp.nextLine();
        System.out.printf("Estado: ");
        String estado = inp.nextLine();

        System.out.printf("%s\n%s, %d\n%s, %s",nome,rua,numero,cidade,estado);

    }
}
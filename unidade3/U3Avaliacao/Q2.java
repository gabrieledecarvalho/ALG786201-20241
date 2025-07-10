/*
Uma página web disponibiliza informações sobre ações de empresas. Ao acessar a página de uma empresa, uma das informações que são mostradas é o preço da ação naquele momento, e algumas estatísticas. A figura a seguir mostra uma parte da página que contém essas informações:

        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/3a97fbd5-9ec4-4f3d-b8e3-0ee0329acd9d/23bf6087-4cca-4238-92cf-d31b87f162b4/image.png)

        As informações usadas para mostrar esse elemento da página web são
        obtidas a partir de um servidor na rede. Ao ser consultado, esse
        servidor fornece essas informações neste formato:

        ```java
        {data:"8/8/2024", nome:"PETR4", cotação:36.27, variação:-0.05, percentual:"-0.14%"}
        ```

        *(isso foi bastante simplificado ... tem mais informações que foram omitidas para facilitar o entendimento do problema !)*

        As informações podem aparecer em qualquer ordem, como neste outro exemplo:

        ```java
        {nome:"PETR4", cotação:36.27, data:"8/8/2024", percentual:"-0.14%", variação:-0.05}
        ```

        Escreva um programa que recebe como dado de entrada uma string com o
        formato das informações fornecidas pelo servidor, e extraia delas
        SOMENTE essas informações, e as mostre na tela da seguinte forma (note
        que eventuais aspas devem ser suprimidas):

        ```java
        DATA: NOME;COTAÇÃO;VARIAÇÃO;PERCENTUAL
        ```

        Exemplo:

        ```java
        8/8/2024: PETR4;36.27;-0.05;-0,14%
        ```

        Se alguma das informações faltar, o programa deve mostrar o seguinte:

        ```java
        dados incompletos
        ```

        **IMPORTANTE**:

        - Seu programa não pode supor que esses valores estejam sempre nas mesmas posições da string !

*/
import java.util.Scanner;

class Q2 {
    static String extrai_valor(String linha, String info){
        int pos = linha.indexOf(info+':');
        if(pos < 0) return ""; // menor que zero significa que não achou
        pos += info.length()+1;
        int fim = linha.indexOf(",", pos+1);
        if(fim < 0) fim = linha.indexOf("}", pos+1;
        String valor = linha.substring(pos,fim);
        return valor.replace("\"",""); // pode ser omtido porque só substitui aspas por vazia
    }
    static void main(String[] args){
        Scanner inp = new Scanner;
        String info = inp.nextLine();

        String data = extrai_valor(info, "data");
        String nome = extrai_valor(info, "nome");
        String contacao = extrai_valor(info, "cotação");
        String variacao = extrai_valor(info, "variação");
        String percentual = extrai_valor(info, "percentual");

        System.out.printf("%s: %s;%s;%s;%s);
    }
}

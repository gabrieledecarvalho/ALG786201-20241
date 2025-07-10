/*Um programa para identificar plágio usa como abordagem calcular a
porcentagem de palavras em comum entre dois textos. Esse programa
identifica todas as palavras presentes em dois textos, e então calcula a
seguinte métrica de similaridade:

        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/3a97fbd5-9ec4-4f3d-b8e3-0ee0329acd9d/b5556c50-c4c3-4797-8891-ae0799d08188/image.png)

        ... sendo:

        - **Pc**: quantidade de palavras comuns a ambos textos
- **P1**: quantidade de palavras no texto 1
        - **P2**: quantidade de palavras no texto 2

Escreva um programa que calcule a similaridade entre dois textos
curtos. Seu programa deve ler ambos textos curtos do teclado, calcular a
similaridade entre ambos, e então mostrar o resultado na tela. Para
simplificar, um texto curto ocupa uma única linha (mas ele pode ter
        pontuação !). Veja um exemplo de execução do programa:

        ```java
Digite o texto 1: um teste de semelhança!
Digite o texto 2: outro teste de semelhança!
Similaridade: 0.56
        ```

Se os textos forem iguais, a similaridade deve ser 1:

        ```java
Digite o texto 1: um teste de semelhança, para verificar se similaridade fica igual
Digite o texto 2: um teste de semelhança, para verificar se similaridade fica igual
Similaridade: 1.00
        ```

        **IMPORTANTE**:

        - Os textos podem ter pontuação (caracteres .,;:?!)
        - A similaridade deve ser mostrada com duas casas decimais
- O cálculo de similaridade deve ser implementado em um método específico com a seguinte declaração:

        ```java
static double similaridade(String texto1, String texto2) {
    // algoritmo de cálculo da similaridade
}
*/
import java.util.Scanner;
public class Teste {

    // método calcula similaridade, pedido na questão
    static double similaridade(String texto1, String texto2){
        String [] t1 = texto1.split(" ");
        String [] t2 = texto2.split(" ");

        int p1 = t1.length;
        int p2 = t2.length;
        int pc = 0;

        for(int i=0;i<p1;i++){
            for(int j=0;j<p2;j++){
                if(t1[i].equals(t2[j])){
                    pc+=1;
                    break;
                }
            }
        }
        return (pc*pc)/(p1*p2);
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Digite o texto 1: ");
        String texto1 = inp.nextLine();
        texto1 = texto1.replace("[.,;:?!)]","");
        System.out.print("Digite o texto 2: ");
        String texto2 = inp.nextLine();
        texto2 = texto2.replace("[.,;:?!)]","");

        System.out.printf("Similaridade: %.2f.\n",similaridade(texto1,texto2));
    }
}
/*
Seu programa deveria fazer o seguinte:

        **Ler duas frases do teclado [FEITO]**

        **calcular a similaridade dessas frases usando um método que implementa o respectivo algoritmo de cálculo [CORRETO]**

        **mostrar o resultado na tela (um número entre 0 e 1 que representa a similaridade) [CORRETO]**

Seu programa funcionou exatamente como esperado ... apesar de alguns testes automáticos dizerem o contrário !

 */
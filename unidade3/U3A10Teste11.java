/*

Escreva um programa que leia do teclado dois conjuntos de strings, e então informe se os conjuntos são iguais (se eles contêm exatamente as mesmas strings). Se os conjuntos forem iguais, seu programa deve mostrar o seguinte:

Resultado: IGUAIS
... e, se forem diferentes, deve mostrar isto:

Resultado: DIFERENTES
Cada conjunto de strings deve ser lido na forma de uma linha CSV (as strings de cada conjunto são delimitadas por vírgula). Veja um exemplo de execução do programa:

Digite conjunto 1: asa,banana,coisa,laranja,sapoti,siriguela
Digite conjunto 2: laranja,siriguela,asa,sapoti,coisa,banana
Resultado: IGUAIS
A comparação dos conjuntos de string deve ser feita em um método escrito especialmente para essa finalidade. Esse método deve ser declarado assim:

static boolean compara_conjuntos(String[] conjunto1, String[] conjunto2) {
  // compara os conteúdos de conjunto1 e conjunto2
  // retorna true se conjuntos forem iguais, false caso contrário
}
Seu programa deve então fazer o seguinte:

Ler os dois conjuntos de string
Chamar o método compara_conjuntos para compará-los
Apresentar o resultado da comparação, exatamente conforme definido no início deste enunciado
ATENÇÃO: seu programa será considerado 100% correto somente se todos os testes automáticos funcionarem !

Ainda assim, eu analisarei a resolução ...
DICA: ordenando vetores
O ordenamento de um vetor pode ser feito com o método Arrays.sort, que está disponível na linguagem Java. Veja um exemplo de uso:

int[] vetor = {3,1,6,8,2,10,6};

// ordena o vetor
Arrays.sort(vetor);

// Agora o "vetor" está ordenado em ordem crescente !
// Se quiser verificar, basta mostrar seu conteúdo:
for (int x: vetor) {
  System.out.printf("%d ", x);
}
... se esse exemplo for executado, ele irá mostrar isto na tela (teste em seu computador):

1 2 3 6 6 8 10
 */


import java.util.Scanner;
import java.util.Arrays;

public class U3A10Teste11 {
    static boolean compara_conjuntos(String[] conjunto1, String[] conjunto2){
        int tamanho = conjunto1.length();
        if(tamanho!=conjunto2.length()){
            return false;
        }
        // ordena o vetor
        Arrays.sort(conjunto1);
        Arrays.sort(conjunto2);

        // fazer para caso os vetores não estiverem em ordem
        for(int i=0;i<tamanho;i++){
            if(! conjunto1[i].equals(conjunto2[i])){
                return false;
            }
        }
        return true;
    }

// operadores ternários -> não usar, é raro em que isso é útil
// String resultado = compara_conjuntos(c1,c2)?"IGUAIS":"RESULTADOS";
// System.out.printf("Resultado: ", + resultado);


    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.print("Conjunto 1: ");
        String l1 = inp.nextLine();
        System.out.print("Conjunto 2: ");
        String l2 = inp.nextLine();

        String [] c1 = l1.split(",");
        String [] c2 = l2.split(",");

        if(compara_conjuntos(c1,c2)){
            System.out.printf("Resultado: IGUAIS");
        }else{
            System.out.printf("Resultado: DIFERENTES");
        }
    }
}
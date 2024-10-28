/*  U2A11E03: Calcular valor de prestação de financiamento
    A compra de um produto a prazo implica financiar o valor da compra, o qual deve ser pago em um número combinado de prestações. O cálculo das prestações se faz considerando uma taxa de juros, a qual remunera o credor do empréstimo. Sabendo qual é a taxa de juros e a quantidade de prestações, pode-se calcular o valor da prestação com a seguinte expressão:

    prestacao

    ... sendo j a taxa de juros mensal e n a quantidade de prestações. A taxa de juros deve ser informada da seguinte forma:

    1%: j=1.01
    2% j=1.02
    10%: j=1.1
    20%: j=1.2
    ... e assim por diante
    Escreva um programa que leia do teclado:

    O valor a ser financiado
    A taxa de juros mensal, que deve ser informada como uma porcentagem
    A quantidade de prestações do financiamento
    Com esses valores, seu programa deve mostrar o seguinte resultado:

    O valor da prestação
    O valor total a ser pago no financiamento
 */

import java.util.Scanner;

public class U2A11E03 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.printf("digite o valor a ser financiado: ");
        float valor = inp.nextFloat(); 
        
        System.out.printf("digite a taxa de juros mensal (%): ");
        float j = inp.nextFloat();
        j = (j/100) + 1;//? segundo a lógia apresentada no exercício
        
        System.out.printf("digite a quantidade de prestações do financeamento: ");
        int n = inp.nextInt();
        
        float prestacao = valor*((Math.pow(j,n))*(j-1))/((Math.pow(j,(n-1)))-1);
        
        float valor_total = prestacao*n;
        
        System.out.printf("O valor da prestação é de %.2f.\nO valor a ser pago no financeamento é de %.2f.", prestacao,valor_total);
    }
}
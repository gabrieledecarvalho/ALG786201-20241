/*
    Um ano bissexto tem um dia a mais do que um ano normal. Esse dia extra é adicionado ao mês de fevereiro, que passa a ter 29 dias em anos bissextos. 
    Um ano bissexto ocorre a cada quatro anos (exceto anos múltiplos de 100 que não são múltiplos de 400). 
    Para saber porque existem anos bissextos, veja na wikipedia !
    Escreva um programa que informa se um determinado ano é bissexto. Seu programa deve mostrar uma mensagem na tela para instruir o usuário, 
    e então ler um número que informe o ano. Em seguida, seu programa deve escrever o seguinte na tela:
        NORMAL: se não for bissexto
        BISSEXTO: se for bissexto
    Importante:
        Use variáveis para evitar fazer cálculos repetidos
        Será avaliado se os tipos de variáveis escolhidos são os mais adequados ao problema
        Seu programa deve explorar o uso de condições escritas usando condições simples combinadas com operadores lógicos
        Para que seu programa seja considerado para fins de avaliação, ele deve ser executável. Assim, se o programa não puder ser executado por algum erro em sua escrita, ele será avaliado com 0 (zero)
            Para evitar esse problema, TESTE E VERIFIQUE seu programa antes de finalizar a resolução do teste ! Isso é melhor feito no Intellij IDEA, onde se pode inclusive fazer debug !
*/

//  Solução U2A07Teste04:

import java.util.Scanner;

public class U2A07Teste04 {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        
        System.out.printf("Digite o ano no formato AAAA: ");
        int ano = inp.nextInt();
        
        //segundo a wikipédia:
        //De 4 em 4 anos é ano bissexto.
        //De 100 em 100 anos não é ano bissexto.
        //De 400 em 400 anos é ano bissexto.
        //Prevalecem as últimas regras sobre as primeiras
        //Então, sempre será bissexto de 400 em 400 anos;
        //Sempre será bissexto de 4 em 4 anos, exceto quando for multiplo de 100
        
        //se o resto da divisão por 400 for igual a zero E o resto da divisão
        //por 100 for diferente de zero é Bissexto 
        //OU o resto da divisão por quatro for zero é bissexto

        if (ano%400 == 0 || ano%4 == 0 && ano%100 != 0) {
            System.out.printf("BISSEXTO\n");    
        } else {
            System.out.printf("NORMAL\n");    
        } 
        
        
    }
}
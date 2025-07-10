/*  U2A06Teste03: Média de 6 números
    Um banco oferece um cartão de crédito para seus clientes, isentando-os de mensalidade se o cliente atender ao menos uma destas condições:
        Possuir pelo menos R$ 50.000 investidos em aplicações financeiras naquele banco
        Ter média de gasto mensal de ao menos R$ 5.000, considerando os três meses anteriores para cálculo da média
        Caso o cliente não atenda pelo menos uma dessas condições, ele deverá pagar mensalidade de R$ 50.
    Escreva um programa que verifique a mensalidade do cartão a ser paga por um cliente desse banco. 
    Seu programa deve ler estas informações digitadas pelo usuário:
        Saldo em aplicações financeiras
        Gasto no cartão em cada um dos três meses anteriores
        Para cada uma dessas informações, seu programa deve mostrar uma mensagem na tela, e então ler o respectivo valor. 
        Ao final, o programa deve mostrar o valor de mensalidade do cartão do cliente.
    Importante:
        Use variáveis para evitar fazer cálculos repetidos
        Será avaliado se os tipos de variáveis escolhidos são os mais adequados ao problema
        Para que seu programa seja considerado para fins de avaliação, ele deve ser executável. Assim, se o programa não puder ser executado por algum erro em sua escrita, ele será avaliado com 0 (zero)
            Para evitar esse problema, TESTE E VERIFIQUE seu programa antes de finalizar a resolução do teste ! Isso é melhor feito no Intellij IDEA, onde se pode inclusive fazer debug !
*/

//  Solução U2A06Teste03:

import java.util.Scanner;

public class U2A06Teste03 {
    
    public static void main(String[] args){
        
        Scanner inp = new Scanner(System.in);
        
        float saldo, gastoMes1, gastoMes2, gastoMes3, media_gasto;
        
        System.out.print("Digite o saldo em aplicações financeiras em reais [R$]: ");
        saldo = inp.nextFloat();
        
        System.out.print("Digite o gasto no cartão nos últimos 3 meses, separados por espaço e em reais [R$]: ");
        gastoMes1 = inp.nextFloat();
        gastoMes2 = inp.nextFloat();
        gastoMes3 = inp.nextFloat();
        
        media_gasto = (gastoMes1 + gastoMes2 + gastoMes3)/3;
        
        if(saldo >= 50000.00 || media_gasto >= 5000){
            System.out.print("Não é necessário pagar mensalidade. Isento.");
        }else{
            System.out.print("Será necessário pagar mensalidade de R$50.00.");
        }
    }
}
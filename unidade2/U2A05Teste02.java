/*
    Um computador de bordo de um veleiro possui um cronômetro que conta os segundos a partir do momento em que ele é zerado e iniciado. 
    Quando o marinheiro quer ver a duração atual da viagem, ele aperta um botão, e o computador de bordo converte o valor do cronômetro 
    para um formato legível como este:
        DD HH:MM:SS
    ... sendo DD a quantidade de dias, e HH:MM::SS o horário desde o início do dia mais recente de viagem. 
    Note que um dia da viagem inicia sempre 24 horas após o início do dia anterior.

    Escreva um programa que faça a conversão do valor do cronômetro para o formato a ser apresentado ao marinheiro. 
    Seu programa deve mostrar uma mensagem na tela solicitando o valor do cronômetro, e então deve ler esse valor. 
    Em seguida, ele deve fazer os cálculos para gerar a duração da viagem no formato desejado, e apresentá-lo na tela.

    Importante:
        Use variáveis para evitar fazer cálculos repetidos
        Será avaliado se os tipos de variáveis escolhidos são os mais adequados ao problema
        Para que seu programa seja considerado para fins de avaliação, ele deve ser executável. 
        Assim, se o programa não puder ser executado por algum erro em sua escrita, ele será avaliado com 0 (zero)
 */

//  Solução U2A05Teste02:
import java.util.Scanner;
    
public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundo, dia, hora, minuto;
        
        System.out.print("Horário em segundos: ");
        
        segundo = input.nextInt();
        
        // dia = (int) segundo/86400;
        dia = segundo/86400;
        segundo = segundo%86400;
        // hora = (int) segundo/60;
        hora = segundo/60;
        segundo = segundo%60;
        // minuto = (int) segundo/60;
        minuto = segundo/60;
        segundo = segundo%60;
        
        System.out.printf("Duração da viagem: %02d %02d:%02d:%02d.",dia, hora, minuto, segundo);
    }
}

//  Avaliação U2A05Teste02:
/* 
    - remover os typecast desnecessários, tais como este:
        dia = (int) segundo/86400;

    O resultado da expressão é do tipo int, então o typecast (int) não tem efeito. 
    E, em geral, typecast deve ser usado com cuidado, para evitar erros com conversões forçadas de tipos.
 */
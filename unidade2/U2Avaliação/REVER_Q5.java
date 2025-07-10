package U2Avaliação;/*  Q5:
    Escreva um programa que verifica a validade de um cronômetro lido do teclado. A validade de um cronômetro significa que ele está no seguinte formato:
        MM:SS.CC
    ... sendo que MM são os minutos, SS são os segundos, e CC são os centésimo de segundo, e todos devem ser formados por dígitos numéricos. Com exceção de CC, todos podem ter um ou dois dígitos. 
    O valor de minutos e segundos deve estar entre 0 e 59, e centésimos de segundo deve estar entre 0 e 99.
    Se o cronômetro for válido, seu programa deve apresentar o próprio valor do cronômetro na tela, da forma como foi informado. Se o cronômetro for inválido, ele deve apresentar o seguinte:
        horário invalido
 */

/*
 *Programa que verifica a validade do tempo lido em um cronômetro.
 */

 import java.util.Scanner;

 public class REVER_Q5 {
     public static void main(String[] args){
         Scanner inp = new Scanner(System.in);
 
         //usuário digita pelo teclado o valor do cronometro:
         System.out.print("Digite o tempo lido no cronômetro [MM:SS:CC]: ");
         String cronometro_original = inp.next();
 
         String p1 = cronometro_original.substring(2,3);
         String p2 = cronometro_original.substring(5,6);
 
         if(p1.equals(":") && p2.equals(":")){
 
             //buscando a posição do primeiro dois pontos, onde divide o minuto do segundo
             int n = cronometro_original.indexOf(":");
 
             //criando a String minuto retirando-a da String cronometro original
             String minuto = cronometro_original.substring(0,n);
             //criando a String cronometro para que não se altere a variavel original, tempo sem os minutos
             String cronometro = cronometro_original.substring(n+1);
 
             n = cronometro.indexOf(":");
             //criando a String segundo, retirando da String cronometro
             String segundo = cronometro.substring(0,n);
             //criando a String centesimo a partir da substring restante de cronometro
             String centesimo = cronometro.substring(n+1);
 
             //criando variaveis inteiras para min, sec e cent a partir das Strings
             int min = Integer.valueOf(minuto);
             int sec = Integer.valueOf(segundo);
             int cent = Integer.valueOf(centesimo);
 
             //verificação do tamanho das Strings, se tem 2 dígitos em min e sec e pelo menos um e menos que 3 no centesimo
             if(minuto.length() != 2 || segundo.length() != 2 || centesimo.length() < 1 || centesimo.length() > 2){
                 System.out.print("horário invalido");
                 return;
                 //verificando se os minutos ou segundos são > 0 e menores que 59 e se os centesimos estao entre 0 e 99
             }if(min > 59 || min < 0 || sec > 59 || sec < 0 || cent > 99 || cent < 0){
                 System.out.print("horario invalido");
                 return;
             }
             //caso nenhum dos ifs sejam verdadeiros, mostra na tela isso:
             System.out.print(cronometro_original);
         }else{
             System.out.print("horario invalido");
         }
     }
 }

/*
 * Seu programa não fornece o resultado esperado, porém com pequenas correções pode funcionar. Você explorou o que estudamos, em especial operações com string e estruturas de decisão.
 */
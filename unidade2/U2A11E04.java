/*  U2A11E04: Verificar se uma data é válida
    Escreva um programa que verifica a validade de uma data ilida do teclado. A validade de uma data significa que ela está no seguinte formato:

    DD/MM/AAAA
    ... sendo que DD é o dia, MM é o mês, e AAAA é o ano, e todos devem ser formados por dígitos numéricos. Tanto dia quanto mês podem ter um ou dois dígitos, mas o ano deve sempre ter 4 dígitos. O valor do dia deve ser um número entre 1 e 31, e o do mês deve estar entre 1 e 12. O dia deve ser consistente com o mês, para evitar que datas como 31/4/2021 sejam consideradas válidas. Por fim, deve-se considerar se o ano é bissexto na verificação do dia do mês.

    Se a data for válida, seu programa deve apresentar a própria data na tela, da forma como foi informada. Se a data for inválida, ele deve apresentar o seguinte:

    data invalida
 */

import java.util.Scanner;

 public class U2A11E04 {
     public static void main(String[] args){
         Scanner inp = new Scanner(System.in);
         
         //mostrando na tela pedindo para o usuário digitar a data:
         System.out.printf("digite a data [DD/MM/AAAA]: ");
         String data_original = inp.nextLine(); //só vai partir para o proximo comando quando o usuário apertar enter
         //retirando espaços desnecessários do início e do fim da data que o usuário possa ter digitado
         String data = data_original.trim();
         
         //achando a string referente ao dia
         int barra = data.indexOf("/"); //posição na string em que a barra se encontra
         String dia = data.substring(0,barra);//substring da posição zero até a posição barra -1 -> intervalo aberto, ou seja, pega os dois números
         dia = dia.trim();
         
         //garantindo que o dia tem até dois dígitos
         if(dia.length() > 2){
             System.out.print("data invalida");
                  return;
         }
         
         //removendo a substring referente ao dia e a primeira barra da string data
         data = data.substring(barra+1);//substring da posição da barra + 1 (intervalo fechado), ou seja, a string logo após a barra, até o fim da string
         data = data.trim();
         
         //achando a string referente ao mês
         barra = data.indexOf("/");
         String mes = data.substring(0,barra);
         mes = mes.trim();
         
         //garantindo que o mês tenha até 2 dígitos
         if(mes.length() > 2){
             System.out.print("data invalida");
                  return;
         }
         
         //achando a string referente ao ano
         String ano = data.substring(barra+1);
         ano = ano.trim();
         
         //garantindo que o ano tenha até 4 dígitos, poderia fazer de uma maneira melhor, para garantir que seja de 0 até 2100 ou até a data de hoje -> ver como
         if(ano.length()>4){
             System.out.print("data invalida");
                  return;
         }
         
         //transformando as strings dia, mes e ano em números inteiros
         int ndia = Integer.valueOf(dia);
         int nmes = Integer.valueOf(mes);
         int nano = Integer.valueOf(ano);
         
         //garantindo que o mês esteja de janeiro (1) até dezembro (12)
         if(nmes < 1 || nmes > 12){ //adicionar a condicional para o ano
             System.out.print("data invalida");
             return;
         }
         
         //garantindo que os dias sejam a partir do 1
         if(ndia < 1){
             System.out.printf("data invalida");
             return;
         }
         
         //garantindo que os meses que tem 31 dias tenham 31 dias
         if ((nmes == 1 || nmes == 3  || nmes == 5  ||  nmes == 7 || nmes == 8 || nmes == 10 || nmes == 12) && (ndia > 31)){
             System.out.printf("data invalida");
             return;
         }
         //garantindo que os meses que tem 30 dias tenham 30 dias
         else if ((nmes == 4  || nmes == 6 || nmes == 9 || nmes == 11) && (ndia > 30)){
             System.out.printf("data invalida");
             return;
         }else if(nmes == 2){
             if(ndia > 29){
                 System.out.print("data invalida");
                     return;
             }if(nano%2 != 0 || (nano%2 == 0 && nano%4 != 0)){//anos ímpares e anos pares não multiplos de 4
                 if (nmes == 2 && ndia > 28){
                     System.out.print("data invalida");
                     return;
                 }
             }
         }else{
             
         }
         System.out.printf("%s é uma data válida", data_original);
         
         // switch (nmes){
         //     case 1:
         //     case 3:
         //     case 5:
         //     case 7:
         //     case 8:
         //     case 10:
         //     case 12:
         //         if(ndia <1 || ndia > 31){
         //             System.out.print("data invalida");
         //             return;
         //     }
         //     case 4:
         //     case 6:
         //     case 9:
         //     case 11:
         //         if(ndia <1 || ndia > 30){
         //             System.out.print("data invalida");
         //             return;
         //         }
         //     case 2:
         //         if(nano%2 != 0 || (nano%2 == 0 && nano%4 != 0)){//anos ímpares e anos pares não multiplos de 4
         //             if (ndia == 29){
         //                 System.out.print("data invalida");
         //             }
         //         }
         // }
     }
 }
 
 
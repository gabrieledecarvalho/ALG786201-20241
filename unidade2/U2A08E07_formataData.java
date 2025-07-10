/*  U2A08E07 - Substituindo mês em uma data contida em uma linha de texto
    Um programa precisa converter uma data deste formato (DD, MM e AAAA são números para dia, mês e ano):
        DD/MM/AAAA
    ... para este outro formato (mmm é formado pelas três primeiras letras do mês):
        mmm DD AAAA
    Escreva um programa que leia uma data no formato DD/MM/AAAA, e então a converta para uma data no formato mmm DD AAAA. 
    A nova data deve ser armazenada em uma String, e em seguida apresentada na tela.
*/

//  Solução U2A08E07:

import java.util.Scanner;
public class U2A08E07_formataData {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        String data, data2, dia, mes, ano;
        
        System.out.printf("Digite a data no formato DD/MM/AAAA: \n");
        data = inp.next();

        //  dia é uma string formada pela substring de data, posição 0 e 1 --> substring(0,2) --> (intervalo fechado, intervalo aberto)
        dia = data.substring(0,2);
        //  mesma lógica do dia para mes e ano
        mes = data.substring(3,5);
        ano = data.substring(6,10);
        
        //  substituindo os números dos meses pelas 3 iniciais com o switch-case:
        if(data.substring(3,4).equals("0")){ // se o número do mês iniciar com zero (posição 3 da string data), é um mês entre janeiro e setembro
            switch(data.substring(4,5)){ // switch para a posição 4 da string data, de 1 a 9
                case "1":
                    mes = "jan";
                    break;
                case "2":
                    mes = "fev";
                    break;
                case "3":
                    mes = "mar";
                    break;
                case "4":
                    mes = "abr";
                    break;
                case "5":
                    mes = "mai";
                    break;
                case "6":
                    mes = "jun";
                    break;
                case "7":
                    mes = "jul";
                    break;
                case "8":
                    mes = "ago";
                    break;
                case "9":
                    mes = "set";
                    break;
                default:
                    System.out.printf("Formato de data errado.\n");
                    return; // caso o formato de data seja errado, ex entrada 00, o programa para após mostrar a mensagem acima
            }
        } else if(data.substring(3,4).equals("1")){ //  caso a posição 3 não seja um zero, mas sim um 1, o mês é de outubro à dezembro
            switch(data.substring(4,5)){ // switch para a posição 4 da string data
                case "1":
                    mes = "nov";
                    break;
                case "2":
                    mes = "dez";
                    break;
                case "0":
                    mes = "out";
                    break;
                default:
                    System.out.printf("Formato de data errado.\n");
                    return; // caso o formato de data seja errado, ex entrada 17, o programa para após mostrar a mensagem acima
            }
        }
        
        //  poderia até fazer um else parando o programa caso o usuário digitasse a dezena do mês errado, exemplo: 22

        //  concatenando o mes, dia e ano com o mes novo, guardando em uma nova string para não perder os dados obtidos anteriormente
        data2 = mes + " " + dia + " " + ano;
        System.out.print(data2);
    }
}

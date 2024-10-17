/*  U2A03E02: mostrando um horário
    Computadores contam o tempo em unidades de tempo, 
    como segundos ou frações de segundo, desde uma data de referência. 
    Assim, o relógio de um computador não mostra uma data e horário, 
    e sim uma contagem de unidades de tempo. No entanto, para o usuário isso não é informativo. 
    Por isso, ao apresentar uma data ou horário para o usuário, 
    um programa faz uma conversão da contagem mantida pelo relógio do computador para um formato apropriado para o usuário.

    Imagine que um computador tenha um relógio que conte segundos desde o início do dia. 
    Assim, quando inicia o dia (meia-noite), o relógio tem valor zero, e quanto termina o dia 
    (um segundo antes da meia-noite), o relógio tem valor 86399. 
    Escreva um programa que transforme o valor desse relógio num formato agradável para o usuário, o qual seria este:
        HH:MM:SS
    ... quer dizer, horas:minutos:segundos, sendo que cada um desses valores deve ter sempre dois dígitos. Ex:
        01:00:30
        12:00:00
    Seu programa deve ler o valor do relógio a partir do teclado, e apresentar o horário convertido na tela.
    DICA: para apresentar um número inteiro com ao menos dois dígitos, use o formato %02d em System.out.printf:
    System.out.printf("Número com dois dígitos: %02d\n", algum_numero);
 */

//  Solução U2A03E02:
import java.util.Scanner; //    importando a classe Scanner

public class U2A03E02_mostraHorario { //    classe pública de nome U2A03E02_mostraHorario
    public static void main(String[] args) { 

        //  criando o objeto scanner, System.in é o que faz com que o input do teclado seja lido
        Scanner input = new Scanner(System.in); 

        //  declarando o tipo das variáveis que serão utilizadas, nesse caso segundos é o nome da variável do tipo inteiro
        int segundo;

        //  objeto de saída print, mostra na tela a mensagem dentro do parênteses
        System.out.print("Horário em segundos: ");

        //  input de algum dado, lendo como inteiro, atribuindo na variável
        segundo = input.nextInt();

        
        //  hora: o inteiro inferior da divisão dos segundos por 3600
        System.out.printf("Horário: %02d:", (int) segundo/3600 ); //    printf: printa na tela os dígitos referentes a hora e não pula a linha
        //  %02d formata o printado com dois dígitos sempre, caso não tenha um no primeiro ou segundo, substitui por zero
        
        //  minuto: resto da divisão inteira de segundos para horas, sobram alguns segundos, dividindo por 60 sobram os minutos com decimais, (int) para pegar o inteiro inferior
        System.out.printf("%02d:", (int) (segundo%3600)/60); // printa na tela os dígitos referentes aos minutos e não pula a linha
        
        //segundos: resto da divisão inteira de segundos para horas -> segundos >= 60; resto da divisão inteira do resto é os segundos < 60 
        System.out.printf("%02d", (segundo%3600)%60); // printa na tela os dígitos referentes aos minutos
    }
}

/*  
    outra solução possível (e melhor) com 3 variáveis:
    int segundo, minuto, hora;
    hora = segundos/3600;
    segundos = segundos - segundos%3600; //segundos restantes
    minutos = segundos/60;
    segundos = segundos - segundos%60; //segundos restantes 2
*/
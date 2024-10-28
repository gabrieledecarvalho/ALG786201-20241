/*  U2A11E02: Calcular tempo decorrido
    Um computador de bordo de um veleiro possui um cronômetro que conta o tempo decorrido a partir do momento em que ele é zerado e iniciado. Quando o marinheiro quer ver a duração atual da viagem, ele aperta um botão, e o computador de bordo mostra o valor do cronômetro da seguinte forma:

        DD HH MM SS
    ... sendo DD a quantidade de dias completos, e HH MM SS o horário que corresponde à fração do dia mais recente da viagem. Esse tempo é contado a partir do início da viagem.

    Imagine que o marinheiro tenha lido o cronômetro em dois instantes importantes da viagem, e queira saber quanto tempo decorreu entre essas duas leituras. Você deve escrever um programa que resolva essa necessidade do marinheiro. Seu programa deve obter as seguintes informações do marinheiro:

    O valor do cronômetro para o primeiro instante
    O valor do cronômetro para o segundo instante
    Para cada um desses valores a ser lido, uma mensagem na tela deve ser apresentada para instruir o marinheiro sobre o que digitar, e então deve ler o valor correspondente. Ao final, ele deve fazer os cálculos para determinar quanto tempo decorreu entre o primeiro e o segundo valor do cronômetro, e apresentá-lo na tela. O valor a ser apresentado deve estar neste formato:

    DD HH:MM:SS
    Por exemplo, se os dois instantes forem:

    01 10 05 20
    02 11 06 01
    ... o programa deve mostrar o seguinte resultado:

    01 01:00:41
    DICA:

    Converta ambos instantes para quantidades de segundos para fazer o cálculo.
    Subtraia o instante 1 do instante 2
    O resultado dessa subtração deve então ser convertido de volta para o formato usado pelo cronômetro.
 */

import java.util.Scanner;

public class U2A11E02 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        //solicitando a primeira leitura de horário ao usuário
        System.out.printf("digite a primeira leitura do horario no cronometro\n[no formato DD HH MM SS, separados por espaço]\n");
        int dia = inp.nextInt();
        int hora = inp.nextInt();
        int minuto = inp.nextInt();
        int segundos1 = inp.nextInt();
        
        //convertendo para segundos
        segundos1 = segundos1 + minuto*60 + hora*3600 + dia*86400;
        //segundos lidos + segundos de minuto 1 min = 60s + segundos das horas 1h = 60 minutos = 3600 segundos + segundo dos dias 1 dia = 24h = 1440 minutos = 86400 segundos
        
        //solicitando a segunda leitura de horário ao usuário, reutilizando as variáveis dia, hora, minuto
        System.out.printf("digite a segunda leitura do horario\n[no formato DD HH MM SS, separados por espaço]\n");
        dia = inp.nextInt();
        hora = inp.nextInt();
        minuto = inp.nextInt();
        int segundos2 = inp.nextInt();
        
        //convertendo para segundos
        segundos2 = segundos2 + minuto*60 + hora*3600 + dia*86400;
        
        
        //diminuindo o tempo total passado na primeira leitura da segunda leitura, isso dá o tempo passado em segundos totais
        int segundo = segundos2 - segundos1;
        
        //conversão de segundos para minutos, horas e dias
        dia = segundo/86400;
        segundo = segundo%86400; //segundo %= 86400;
        hora = segundo/3600;
        segundo = segundo%3600; //segundo %= 3600;
        minuto = segundo/60;
        segundo = segundo%60; //segundo %= 60;
        
        //mostrando na tela formatado, no formato decimal int com pelo menos dois algarismos
        System.out.printf("%02d %02d:%02d:%02d", dia, hora, minuto, segundo);
        
    }
        
}
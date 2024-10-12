/*  U2A02E09 - Consumo de um veículo
    Crie um programa que calcule a quantidade de litros de combustível gasta em uma viagem, 
    considerando um automóvel que faz 12 km por litro. 
    Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. 
    Com isso, é possível calcular a distância percorrida com a fórmula:
        DISTANCIA = TEMPO * VELOCIDADE
    Tendo o valor da distância, basta calcular a quantidade de litros de combustível 
    utilizada na viagem com a  fórmula:
        LITROS_USADOS = DISTANCIA / 12
    O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a 
    quantidade de litros utilizada na viagem.

    Seu programa deve mostrar uma mensagem na tela pedindo o tempo gasto na viagem, 
    o qual deve ser dado em minutos, e em seguida deve ler o valor digitado. 
    Depois deve mostrar uma mensagem pedindo a velocidade média, a qual deve ser dada em km/h, 
    e ler esse valor. Ao final, ele deve mostrar o seguinte:
        Velocidade media: velocidade_media km/h
        Tempo gasto: HH:MM h
        Distancia percorrida: distancia_calculada km
        Consumo do veículo: quantidade_de_litros l
 */

//  Solução U2A02E09:
import java.util.Scanner;

public class U2A02E09_consumoVeiculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //  definindo as variáveis tempo, velocidade, distância e litros em ponto flutuante (double/float)
        double t, v, d, l;
        //  definindo as variáveis minutos e horas como inteiros:
        int m, h;
        
        //  imprimindo na tela a informação desejada e pedindo o valor do teclado logo em seguida:
        System.out.print("Tempo gasto na viagem (min): ");
        t = input.nextDouble();
        
        System.out.print("Velocidade média do automóvel (km/h): ");
        v = input.nextDouble();
        
        //  iniciando os cálculos:
        d = (t*v)/60; //km = min*h*km/h*60min
        l = d/12; //km/L
        m = t%60; //    m é o resto da divisão inteira na conversão para horas, ou seja, divisão por 60
        h = (int)t/60; //   forçar a conversão (int) não é uma boa prática, defini m e h como inteiro lá em cima, dividindo por um inteiro será outro inteiro
        
        //  imprimindo a informação final formatada:
        System.out.printf("Velocidade média: %.2f km/h\n", v);
        System.out.printf("Tempo gasto: %d:%d h\n", h, m); //   %d imprime inteiro decimal
        System.out.printf("Distância percorrida: %.2f km.\n",d);
        System.out.printf("Consumo do veículo: %.3f L.", l);
    }
}